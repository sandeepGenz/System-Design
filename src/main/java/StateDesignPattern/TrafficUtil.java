package src.main.java.StateDesignPattern;

public class TrafficUtil {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        context.change();
        context.change();
        context.change();
    }
}
