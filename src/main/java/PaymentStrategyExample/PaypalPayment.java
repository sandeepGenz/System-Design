package src.main.java.PaymentStrategyExample;

public class PaypalPayment implements PaymentStrategy{
    String email;

    public PaypalPayment(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying through paypal "+ email);
    }
}
