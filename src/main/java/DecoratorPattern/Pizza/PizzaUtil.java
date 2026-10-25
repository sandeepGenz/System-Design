package src.main.java.DecoratorPattern.Pizza;

public class PizzaUtil {
    public static void main(String[] args) {
        BasePizza margeritaPizza = new ExtraJalepino(new ExtraCheese(new MargeritaPizza()));



        System.out.println(margeritaPizza.cost());
    }
}
