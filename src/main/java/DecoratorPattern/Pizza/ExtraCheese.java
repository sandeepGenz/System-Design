package src.main.java.DecoratorPattern.Pizza;

public class ExtraCheese extends BasePizza{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
