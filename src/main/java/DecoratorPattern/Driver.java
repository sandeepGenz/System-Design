package src.main.java.DecoratorPattern;

public class Driver {
    public static void main(String[] args)
    {
        BasePizza pizza = new ExtraCheese(new MargeritaPizza());
        System.out.println(pizza.cost());

        BasePizza pizza1 = new ExtraDip(new VeggieDelightPizza());
        System.out.println(pizza1.cost());
    }
}
