package src.main.java.WalmartPrep.Payment;

public class UPIPayment implements PaymentStrategy{

    private final String upi;
    public UPIPayment(String upi) {
        this.upi = upi;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Payment through UPI : " + amount);
        // call external api
        return true;
    }
}
