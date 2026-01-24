package src.main.java.StateDesignPattern;

public class RedLightState implements TrafficLightState{
    @Override
    public void handle(TrafficLightContext context) {
        System.out.println("Red Light");
        context.setState(new YellowLightState());
    }
}
