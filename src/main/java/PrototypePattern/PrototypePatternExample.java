package src.main.java.PrototypePattern;

public class PrototypePatternExample {
    public static void main(String[] args)
    {
        Shape circle = new Shape("Circle" , "Red");
        System.out.println("Original : "+ circle);

        Shape clonedCircle = (Shape) circle.clone();
        System.out.println("Cloned : "+ clonedCircle);

        clonedCircle.setColor("Blue");
        System.out.println("Modified Clone: " + clonedCircle);

        System.out.println("Original After Modification " + circle);

    }
}
