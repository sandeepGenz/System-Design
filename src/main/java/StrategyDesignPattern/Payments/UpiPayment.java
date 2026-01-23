package src.main.java.StrategyDesignPattern.Payments;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("UPI: " + amount);
    }
}
