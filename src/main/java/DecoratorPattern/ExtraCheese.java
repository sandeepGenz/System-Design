package src.main.java.DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{

    BasePizza pizza;

    ExtraCheese(BasePizza pizza)
    {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 25;
    }
}
