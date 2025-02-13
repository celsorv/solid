# SOLID

## LSP – Princípio da Substituição de Liskov (Liskov Substitution Principle)

O LSP afirma que uma classe derivada (subclasse) deve poder substituir completamente sua classe base (superclasse) 
sem alterar o comportamento esperado do programa.

Ou seja, se uma classe filha não pode ser usada no lugar da classe pai sem quebrar o código, há um problema de design.

> O nome **Liskov Substitution Principle (LSP)** vem da cientista da computação [**Barbara Liskov**](https://pt.wikipedia.org/wiki/Barbara_Liskov), que formulou esse 
> conceito em 1987.
> 
> Ela apresentou essa ideia em uma conferência sobre **tipagem e hierarquia de classes**, propondo que **se um programa 
> usa um tipo base, ele deve poder usar qualquer subtipo desse tipo sem problemas**.
> Em outras palavras, **uma subclasse deve ser substituível por sua superclasse sem alterar o comportamento correto do sistema**.
> Esse princípio se tornou um dos pilares da programação orientada a objetos e foi formalizado dentro dos princípios **SOLID**.


### ❌ Exemplo Ruim (Violando LSP)

Aqui temos uma classe Bird e uma subclasse Penguin. Mas há um problema: nem todos os pássaros voam!

```java
// Classe base (superclasse)
class Bird {
    public void fly() {
        System.out.println("Voando...");
    }
}

// ❌ Pinguins não voam, mas herdam um comportamento que não faz sentido.
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }
}
```

#### 🔴 Problema: O código viola o LSP porque Penguin não pode ser usado de forma segura no lugar de Bird, já que o método fly() lança uma exceção inesperada.

### ✅ Exemplo Correto (Seguindo LSP)

A solução é refatorar a hierarquia de classes para que apenas os pássaros que voam tenham o método fly().

```java
// ✅ Interface para pássaros em geral
interface Bird {
    void eat();
}

// ✅ Interface específica para pássaros que voam
interface FlyingBird extends Bird {
    void fly();
}

// ✅ Pardal pode voar
class Sparrow implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Pardal está comendo.");
    }

    @Override
    public void fly() {
        System.out.println("Pardal está voando!");
    }
}

// ✅ Pinguim agora não herda comportamento indevido
class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Pinguim está comendo.");
    }
}
```

Agora, qualquer instância de Bird pode ser usada corretamente sem quebrar o código!

### 🎯 Benefícios do LSP
- Evita comportamentos inesperados em subclasses
- Garante código mais previsível e robusto
- Facilita manutenção e extensão do código

Esse princípio ajuda a manter a coerência da hierarquia de classes, evitando heranças incorretas!
