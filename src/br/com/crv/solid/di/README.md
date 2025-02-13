# DI - Injeção de Dependência (Dependency Injection)

A **Injeção de Dependência** (DI) é um padrão de design que segue o princípio **Inversão de Dependência** 
(Dependency Inversion Principle - DIP), parte do SOLID. Este princípio visa reduzir o acoplamento entre componentes
de software, promovendo maior flexibilidade, testabilidade e manutenção.

## O que é Injeção de Dependência?

Injeção de Dependência é um padrão onde as dependências de uma classe são "injetadas" nela de fora, ao invés de serem 
criadas diretamente dentro da classe. Isso torna o código mais modular e desacoplado.

### 🧩 **Princípio da Inversão de Dependência (DIP)**

- **Módulos de alto nível** não devem depender de módulos de baixo nível, mas ambos devem depender de abstrações.
- **Detalhes concretos** (como implementações específicas de classes) devem depender de abstrações, e **não o contrário**.

## ❌ Exemplo sem Injeção de Dependência (violando DIP)

Imagine uma classe que realiza o pagamento de uma compra. Sem a injeção de dependência, ela pode depender diretamente 
de classes específicas como **CartãoDeCredito** ou **Boleto**, fazendo com que o código se torne difícil de testar e manter.

```java
class Pagamento {
    private CartaoDeCredito cartaoDeCredito;

    public Pagamento() {
        cartaoDeCredito = new CartaoDeCredito(); // Dependência diretamente criada
    }

    public void realizarPagamento() {
        cartaoDeCredito.processarPagamento();
    }
}
```

### Problema:
- **Acoplamento forte**: A classe **Pagamento** depende diretamente de **CartaoDeCredito**, tornando difícil substituir
a classe de pagamento ou testar de forma independente.
- **Falta de flexibilidade**: Se quisermos adicionar uma nova forma de pagamento, como **Boleto**, precisaremos 
modificar a classe **Pagamento**.

## ✅ Solução com Injeção de Dependência (atendendo DIP)

A **injeção de dependência** resolve o problema, permitindo que a classe **Pagamento** dependa de uma abstração (interface) para realizar o pagamento, ao invés de depender de uma classe concreta específica. Isso pode ser feito através do **construtor**, **setters** ou **interfaces**.

### Exemplo com Injeção de Dependência via Construtor

```java
// Interface de Pagamento
interface PagamentoMetodo {
    void processarPagamento();
}

// Implementação para Cartão de Crédito
class CartaoDeCredito implements PagamentoMetodo {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com Cartão de Crédito.");
    }
}

// Implementação para Boleto
class Boleto implements PagamentoMetodo {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com Boleto.");
    }
}

// Classe Pagamento agora não cria mais as dependências diretamente
class Pagamento {
    private PagamentoMetodo pagamentoMetodo;

    // A dependência é injetada via construtor
    public Pagamento(PagamentoMetodo pagamentoMetodo) {
        this.pagamentoMetodo = pagamentoMetodo;
    }

    public void realizarPagamento() {
        pagamentoMetodo.processarPagamento();
    }
}
```

### Exemplo de uso com Injeção de Dependência

```java
public class Main {
    public static void main(String[] args) {
        PagamentoMetodo cartao = new CartaoDeCredito();
        PagamentoMetodo boleto = new Boleto();

        // A classe Pagamento recebe diferentes implementações de pagamento
        Pagamento pagamento1 = new Pagamento(cartao);
        Pagamento pagamento2 = new Pagamento(boleto);

        pagamento1.realizarPagamento(); // Pagamento com Cartão de Crédito
        pagamento2.realizarPagamento(); // Pagamento com Boleto
    }
}
```

### 🎯 Vantagens da Injeção de Dependência:
- **Desacoplamento**: A classe **Pagamento** não precisa conhecer a implementação concreta de **CartaoDeCredito** ou 
**Boleto**, basta conhecer a interface **PagamentoMetodo**.
- **Testabilidade**: Podemos testar **Pagamento** facilmente, injetando dependências mockadas ou fakes sem depender 
de implementações reais.
- **Flexibilidade**: Se precisar adicionar um novo método de pagamento, como **Paypal**, basta criar uma nova 
implementação de **PagamentoMetodo**, sem alterar a classe **Pagamento**.

### 📌 Resumo
A Injeção de Dependência permite que a classe **Pagamento** dependa de abstrações, em vez de depender de classes concretas, 
promovendo a flexibilidade, desacoplamento e testabilidade. Usando a DI, novas implementações de **PagamentoMetodo** 
podem ser adicionadas sem modificar o código existente.

