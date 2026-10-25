package src.main.java.FactoryPattern.Shape;

public class ShapeFactoryImpl {
    public static void main(String[] args) {
        ShapeFactory factory1 = new ShapeFactory();

        Shape shapeObj1 = factory1.getShape("RECTANGLE");

        shapeObj1.draw();

    }
}
