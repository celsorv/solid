# SOLID

## OCP - Princípio Aberto/Fechado (Open/Closed Principle )

- Uma classe deve estar aberta para extensão, mas fechada para modificação.
- Isso significa que novas funcionalidades devem ser adicionadas através da herança ou composição, sem modificar 
o código existente.

### ❌ Exemplo que viola o princípio (código fechado para extensão)

Imagine que temos uma classe que calcula descontos com base no tipo de cliente:

```java
class DiscountCalculator {
    public double calculateDiscount() {
        if (firstCondition) {

        } else if (secondCondition) {

        } else if (otherConditions) {

        }
        return 0;
    }
}

```

#### Problema:

- Se precisarmos adicionar um novo tipo de cliente (Gold, por exemplo), teremos que modificar a classe existente.
- Isso viola o Princípio Aberto/Fechado, pois a classe não está fechada para modificações.

### ✅ Solução usando o princípio Open/Closed

Podemos reformular o código usando herança ou polimorfismo, tornando-o aberto para extensão sem precisar modificar 
o código existente.

```java
// Interface para desconto
interface DiscountStrategy {
    double applyDiscount(double amount);
}

// Implementação para cliente Regular
class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
}

// Implementação para cliente VIP
class VIPDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }
}

// Agora podemos criar o cálculo de desconto sem depender de if-else
class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.applyDiscount(amount);
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        
        DiscountStrategy regular = new RegularDiscount();
        DiscountStrategy vip = new VIPDiscount();
        
        System.out.println("Desconto Regular: " + calculator.calculateDiscount(regular, 1000));
        System.out.println("Desconto VIP: " + calculator.calculateDiscount(vip, 1000));
    }
}
```

### 🎯 Vantagens da abordagem
- __Aberto para extensão__: Se quisermos adicionar um novo tipo de cliente (Gold, Platinum, etc.), basta criar uma nova 
classe sem modificar o código existente.
- __Fechado para modificação__: O código do DiscountCalculator não precisa ser alterado toda vez que um novo tipo
de desconto for adicionado.
- __Facilidade de manutenção__: Cada classe tem uma única responsabilidade e pode ser alterada ou testada separadamente.

### 📌 Resumo
- No primeiro exemplo, sempre que um novo tipo de cliente fosse adicionado, teríamos que alterar o código existente. 
- No segundo exemplo, conseguimos adicionar novos descontos sem modificar a classe principal, seguindo o Princípio 
Aberto/Fechado.