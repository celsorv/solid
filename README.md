# 🏗️ **SOLID**

O termo **SOLID** é um acrônimo que representa cinco princípios de design de software que ajudam a criar sistemas mais fáceis de entender, desenvolver e manter. Esses princípios foram introduzidos por **Robert C. Martin** (também conhecido como **Uncle Bob**) e são utilizados para melhorar a qualidade do código, promovendo flexibilidade e escalabilidade.

Cada letra do acrônimo **SOLID** se refere a um princípio específico:

##  S – **Single Responsibility Principle** (Princípio da Responsabilidade Única)
Uma classe deve ter **apenas uma razão para mudar**, ou seja, ela deve ter **apenas uma responsabilidade**.

#### 👨‍💻 [Classe Funcionário responsável também por calcular taxa?](./src/br/com/crv/solid/srp/README.md)

## O – **Open/Closed Principle** (Princípio Aberto/Fechado)
As classes devem ser **abertas para extensão**, mas **fechadas para modificação**. Isso significa que você deve ser capaz de adicionar comportamentos a uma classe sem alterá-la.

#### 🔓 [Lista de IF's para determinar o Tipo de Desconto dentro da classe?](./src/br/com/crv/solid/ocp/README.md)

## L – **Liskov Substitution Principle** (Princípio da Substituição de Liskov)
Objetos de uma classe base devem ser **substituíveis por objetos de suas subclasses** sem alterar o comportamento correto do programa.

#### 🦅 [Pássaro e Pinguim herdando da classe Bird? Mas Pinguim não voa!](./src/br/com/crv/solid/lsp/README.md)

## I – **Interface Segregation Principle** (Princípio da Segregação de Interface)
Os clientes não devem ser forçados a **depender de interfaces que não utilizam**. Ou seja, interfaces menores e mais específicas são melhores do que interfaces grandes e genéricas.

#### 📠 [Impressora comum implementando Interface de Multifuncional? Mas ela não tem scanner e nem fax!](./src/br/com/crv/solid/isp/README.md)

## D – **Dependency Inversion Principle** (Princípio da Inversão de Dependência)
Módulos de **alto nível** não devem depender de módulos de **baixo nível**. Ambos devem depender de abstrações. Além disso, abstrações não devem depender de detalhes concretos; os detalhes devem depender de abstrações.

#### 💳 [Classe Pagamento que instancia classe Boleto? Mas eu quero pagar com Cartão!](./src/br/com/crv/solid/dip/README.md)

## 🔗 Saiba mais sobre Injeção de Dependência

A Injeção de Dependência (DI) é uma técnica fundamental para seguir o **Princípio da Inversão de Dependência (DIP)**. 
Para entender melhor como a Injeção de Dependência pode ser aplicada no seu código, confira uma explicação mais 
detalhada [aqui](./src/br/com/crv/solid/di/README.md).
