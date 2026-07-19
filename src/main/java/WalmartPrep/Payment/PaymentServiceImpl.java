package src.main.java.WalmartPrep.Payment;

public class PaymentServiceImpl {

    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = null;

        paymentStrategy = new UPIPayment("7xedio@oksbi");

        paymentStrategy.pay(500);

        paymentStrategy = new CreditCartPayment("4443");

        paymentStrategy.pay(1000);
    }
}
