package NewLLD.SOLID;

/*

Violation :

class EmailService {
    public void sendEmail(String message) {
        System.out.println("Email: " + message);
    }
}

class OrderService {
    private EmailService emailService =
            new EmailService();

    public void placeOrder() {
        System.out.println("Order placed");
        emailService.sendEmail("Order confirmed");
    }
}



 */

interface NotificationService {
    public void notify(String message);
}

class EmailService implements NotificationService {

    @Override
    public void notify(String message) {
        System.out.println("EMAIL " + message);
    }
}

class SMSService implements NotificationService {

    @Override
    public void notify(String message) {
        System.out.println("SMS " + message);
    }
}

class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.notify("PLAced");
    }

}


public class DependencyInversion {
    public static void main(String[] args) {
        OrderService emailService = new OrderService(new EmailService());
        emailService.placeOrder();
        OrderService smsService = new OrderService(new SMSService());
        smsService.placeOrder();
    }
}
