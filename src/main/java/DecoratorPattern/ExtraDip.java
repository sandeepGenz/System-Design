package src.main.java.DecoratorPattern;

public class ExtraDip extends ToppingDecorator{
    BasePizza pizza ;

    ExtraDip(BasePizza pizza)
    {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return pizza.cost() + 10;
    }
}
