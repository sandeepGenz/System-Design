package src.main.java.StrategyDesignPattern.Payments;

public class PaymentUtil {
    public static void main(String[] args) {
        PaymentContext Upicontext = new PaymentContext(new UpiPayment());
        Upicontext.makePayment(500);

        PaymentContext Creditcontext = new PaymentContext(new CreditPayment());
        Creditcontext.makePayment(1000);
    }
}
