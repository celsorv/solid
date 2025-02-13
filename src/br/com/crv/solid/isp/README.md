# SOLID

## ISP - Princípio da Segregação de Interface (Interface Segregation Principle)

> O Interface Segregation Principle (ISP) é o quarto princípio do SOLID e trata da segregação das interfaces, ou seja, 
> evita criar interfaces grandes e genéricas, que forçam as classes a implementar métodos que não são necessários para
> elas. A ideia é que uma classe não deve ser forçada a implementar métodos que ela não usa.

- **Definição:** Uma interface deve ser pequena, com métodos que estão diretamente relacionados ao comportamento 
da classe que a implementa. Se uma classe implementa uma interface com muitos métodos que ela não usa, isso pode
resultar em dependências desnecessárias e dificultar a manutenção do código.


- **Evite:** Criar interfaces grandes com muitos métodos que não fazem sentido para todas as classes que a implementam.


- **Favor:** Dividir interfaces grandes em interfaces menores e mais coesas, para que as classes implementem apenas os 
métodos que realmente são necessários para elas.

#### 📚 [Dicio: Segregação](https://www.dicio.com.br/segregacao/)


### ❌ Exemplo Ruim (Violando o ISP):

```java
// Interface grande
interface Printer {
    void printDocument(String content);
    void faxDocument(String content);
    void scanDocument(String content);
}

// Classe que implementa a interface
class MultiFunctionPrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }

    public void faxDocument(String content) {
        System.out.println("Faxing document: " + content);
    }

    public void scanDocument(String content) {
        System.out.println("Scanning document: " + content);
    }
}

// Classe que não usa todos os métodos
class SimplePrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }

    public void faxDocument(String content) {
        // Não faz fax, mas é obrigado a implementar o método
    }

    public void scanDocument(String content) {
        // Não faz scan, mas é obrigado a implementar o método
    }
}
```

No exemplo acima, a classe SimplePrinter não precisa dos métodos faxDocument e scanDocument, mas ainda assim é obrigada 
a implementá-los porque a interface Printer é muito genérica.

#### ✅ Exemplo Correto (Seguindo o ISP):

```java
// Interfaces segregadas
interface Printer {
    void printDocument(String content);
}

interface FaxMachine {
    void faxDocument(String content);
}

interface Scanner {
    void scanDocument(String content);
}

// Classe que implementa todas as interfaces
class MultiFunctionPrinter implements Printer, FaxMachine, Scanner {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }

    public void faxDocument(String content) {
        System.out.println("Faxing document: " + content);
    }

    public void scanDocument(String content) {
        System.out.println("Scanning document: " + content);
    }
}

// Classe que implementa apenas a interface necessária
class SimplePrinter implements Printer {
    public void printDocument(String content) {
        System.out.println("Printing document: " + content);
    }
}
```

Agora, a interface foi segregada em três partes: Printer, FaxMachine e Scanner. A classe SimplePrinter implementa 
apenas a interface que é relevante para ela, sem ser forçada a implementar métodos desnecessários.

### 🎯 Vantagens do ISP:

- **Coesão:** As interfaces ficam mais coesas e específicas, refletindo melhor o comportamento das classes.
- **Menor acoplamento:** As classes não ficam acopladas a métodos que não usam, facilitando a manutenção e evolução do sistema.
- **Facilidade de Extensão:** Adicionar novos tipos de comportamento (interfaces) é mais fácil, sem que as classes precisem alterar os métodos que não utilizam.

### 📌 Resumo

O ISP ajuda a criar sistemas mais flexíveis, onde as classes têm controle sobre as funcionalidades que precisam
implementar, sem serem obrigadas a assumir responsabilidades que não correspondem ao seu comportamento real.

