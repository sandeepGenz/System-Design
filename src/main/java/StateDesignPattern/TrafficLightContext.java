package src.main.java.StateDesignPattern;

public class TrafficLightContext {
    private TrafficLightState state;

    public TrafficLightContext() {
        state = new RedLightState(); //initial state
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.handle(this); // this is actually the current context (here it is current traffic light)
    }
}

// perfect example of runtime polymorphism