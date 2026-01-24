package src.main.java.StateDesignPattern;

public class GreenLightState implements TrafficLightState{
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Green Light");
        context.setState(new RedLightState());
    }
}
