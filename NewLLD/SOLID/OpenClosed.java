package NewLLD.SOLID;

/*

Violation

class DiscountCalculator {
    public double calculate(
            String customerType, double amount) {

        if (customerType.equals("REGULAR")) {
            return amount * 0.05;
        } else if (customerType.equals("PREMIUM")) {
            return amount * 0.10;
        }

        return 0;
    }
}


 */

interface Discount {
    double applyDiscount(double amount);
}
class RegularCustomer implements Discount {
    
    // Regular customer

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.5;
    }
}

class PremiumCustomer implements Discount {
    
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.7;
    }
}

class DiscountCalculator {
    public double calculateDiscount(Discount discount , double amount) {
        return discount.applyDiscount(amount);
    }
}

public class OpenClosed {
    public static void main(String[] args) {
        Discount regular = new RegularCustomer();
        Discount premium = new PremiumCustomer();
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculateDiscount(regular,25));
        System.out.println(calculator.calculateDiscount(premium,25));
    }
}
