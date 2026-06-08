package src.main.java.PaymentStrategyExample;

public class GpayPayment implements PaymentStrategy{

    String pin;

    public GpayPayment(String pin) {
        this.pin = pin;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying through gpay "+ pin );

    }
}
