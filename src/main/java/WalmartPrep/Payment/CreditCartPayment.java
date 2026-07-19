package src.main.java.WalmartPrep.Payment;

public class CreditCartPayment implements PaymentStrategy{

    private final String cvv;

    public CreditCartPayment(String cvv) {
        this.cvv = cvv;
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment through Credit cart : " + amount);

        return true;
    }
}
