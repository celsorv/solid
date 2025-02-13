# SOLID

## DIP - Princípio da Inversão de Dependência (Dependency Inversion Principle)

O DIP é o último dos princípios SOLID. Ele trata de como as classes e módulos devem ser estruturados para promover a 
flexibilidade e a reutilização do código. Esse princípio tem como objetivo reduzir o acoplamento entre módulos de alto 
nível e módulos de baixo nível, invertendo as dependências de uma maneira que favoreça a abstração.

### Definição:

O DIP é composto por duas regras principais:

- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.
- As abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.

Em termos simples, isso significa que a lógica de alto nível (como regras de negócio) não deve depender diretamente de 
implementações específicas (como bancos de dados, APIs, etc.). Em vez disso, ela deve depender de abstrações, como 
interfaces ou classes abstratas. As implementações específicas, como o banco de dados, devem implementar essas abstrações.

### ❌ Exemplo Ruim (Antes do DIP):

Imagine que você tem uma classe de "Pagamento" que depende diretamente de uma classe "Boleto", o que causa um alto acoplamento:

```java
public class Pagamento {
    private Boleto boleto;

    public Pagamento() {
        this.boleto = new Boleto(); // Pagamento depende diretamente de Boleto
    }

    public void realizarPagamento() {
        boleto.emitir();
        // código para realizar o pagamento
    }
}

public class Boleto {
    public void emitir() {
        System.out.println("Emitindo boleto...");
    }
}
```

Neste caso, a classe Pagamento depende diretamente da implementação Boleto. Se no futuro você quiser alterar para outro 
meio de pagamento (como Cartão de Crédito), precisará modificar diretamente a classe Pagamento, o que viola o DIP.

### ✅ Exemplo Correto (Após DIP):

Com o DIP, a classe Pagamento vai depender de uma abstração (interface PagamentoMetodo), e a implementação específica 
de Boleto vai depender dessa abstração, permitindo flexibilidade:

```java
public interface PagamentoMetodo {
    void realizarPagamento();
}

public class Pagamento {
    private PagamentoMetodo metodoPagamento;

    public Pagamento(PagamentoMetodo metodoPagamento) {
        this.metodoPagamento = metodoPagamento; // Injeção de dependência
    }

    public void realizarPagamento() {
        metodoPagamento.realizarPagamento();
    }
}

public class Boleto implements PagamentoMetodo {
    @Override
    public void realizarPagamento() {
        System.out.println("Emitindo boleto...");
    }
}

public class CartaoDeCredito implements PagamentoMetodo {
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento com cartão de crédito...");
    }
}
```

Agora, a classe Pagamento depende de uma abstração (PagamentoMetodo), não de implementações específicas. Isso facilita 
a adição de novos métodos de pagamento, como CartaoDeCredito, sem alterar a classe Pagamento. Isso reduz o acoplamento
e aumenta a flexibilidade do código.

### 🎯 Benefícios do DIP:

- **Flexibilidade:** Permite que o sistema seja facilmente estendido sem modificar código existente.

- **Redução de Acoplamento:** Módulos de alto nível não dependem mais diretamente de módulos de baixo nível, tornando 
o sistema mais modular e menos propenso a mudanças.

- **Facilidade de Testes:** Como as classes de alto nível dependem de abstrações, é mais fácil fazer testes unitários, 
pois podemos substituir implementações concretas por mocks ou stubs.
