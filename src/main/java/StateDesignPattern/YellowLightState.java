package src.main.java.StateDesignPattern;

public class YellowLightState implements TrafficLightState{
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Yellow Light");
        context.setState(new GreenLightState());
    }
}
