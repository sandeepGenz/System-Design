package src.main.java.PaymentStrategyExample;

public class CreditCardPayment implements PaymentStrategy{

    String name;
    String number;
    String cvv;

    public CreditCardPayment(String name, String number, String cvv) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paying through credit card from " + name);
    }
}
