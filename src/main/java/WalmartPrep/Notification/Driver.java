package src.main.java.WalmartPrep.Notification;

import src.main.java.FacadeDesignPattern.OrderFacade;

import java.util.List;

public class Driver {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        NotificationObserver email = new EmailNotification();
        NotificationObserver sms = new SmsNotification();

        notificationService.subscribe(email);
        notificationService.subscribe(sms);

        notificationService.placeOrder("ORD-0909");

        notificationService.unsubscribe(email);


        notificationService.placeOrder("ORDddd-0909");

    }


}
