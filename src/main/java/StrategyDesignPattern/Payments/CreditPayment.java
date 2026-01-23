package src.main.java.StrategyDesignPattern.Payments;

public class CreditPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Credit Card : " + amount);
    }
}
