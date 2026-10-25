package src.main.java.FactoryPattern.Shape;

public class ShapeFactory {

    public ShapeFactory() {

    }

    public Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();

            case "RECTANGLE":
                return new Rectangle();

            case "SQUARE":
                return new Square();

            default:
                return null;
        }
    }
}
