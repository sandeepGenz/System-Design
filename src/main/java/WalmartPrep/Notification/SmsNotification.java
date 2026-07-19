package src.main.java.WalmartPrep.Notification;

public class SmsNotification implements NotificationObserver{
    @Override
    public void update(String eventType, String orderId) {
        System.out.println("Sending SMS notification : " + eventType + " " + orderId);
    }
}
