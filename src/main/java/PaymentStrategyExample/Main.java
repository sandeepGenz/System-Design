package src.main.java.PaymentStrategyExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = 100;

        System.out.println("Press 1 to pay through credit card");
        System.out.println("Press 2 to pay through gpay");
        System.out.println("Press 3 to pay through paypal");

        int choice = sc.nextInt();

        sc.nextLine();

        PaymentStrategy strategy = null;

        // factory design pattern for creating required strategies

        switch (choice) {
            case 1 :
                System.out.println("name");
                String name = sc.nextLine();
                System.out.println("number");
                String number = sc.nextLine();
                System.out.println("cvv");
                String cvv = sc.nextLine();

                strategy = new CreditCardPayment(name,number,cvv);
                break;

            case 2 :
                System.out.println("pin");
                String pin = sc.nextLine();

                strategy = new GpayPayment(pin);
                break;


            case 3 :
                System.out.println("email");
                String email = sc.nextLine();

                strategy = new PaypalPayment(email);
                break;

            default:
                System.out.println("Enter a valid choice");
        }

        assert strategy != null;
        strategy.pay(amount);

    }
}
