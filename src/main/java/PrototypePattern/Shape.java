package src.main.java.PrototypePattern;

public class Shape implements Prototype{

    private String type;
    private String color;

    public Shape(String type , String color)
    {
        this.type = type;
        this.color = color;
    }

    // setter for color to demonstrate modifications

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public Prototype clone() {

        return new Shape(this.type , this.color); // create a new obj with the same state
    }

    @Override
    public String toString(){
        return "Shape [Type: " + type + ", Color: " + color + "]";
    }
}
