# Projeto: Estratégia de Cálculo de Desconto com Strategy Pattern

Este projeto demonstra a implementação do padrão de design Strategy em Java. O padrão Strategy permite definir uma família de algoritmos, encapsulá-los em classes separadas e torná-los intercambiáveis. Neste exemplo, diferentes estratégias de cálculo de desconto são aplicadas a um carrinho de compras.

## Estrutura do Projeto

- `Strategy.java`: Interface para a estratégia de cálculo de desconto.
- `NoDiscountStrategy.java`: Implementação de estratégia sem desconto.
- `PercentageDiscountStrategy.java`: Implementação de estratégia de desconto percentual.
- `FixedDiscountStrategy.java`: Implementação de estratégia de desconto fixo.
- `ShoppingCart.java`: Classe que utiliza uma estratégia de desconto.
- `Main.java`: Classe principal para testar as estratégias.

## Classes e Interfaces

### Strategy.java
Define a interface para o cálculo de desconto.

```java
public interface Strategy {
    double calculateDiscount(double total);
}