package src.main.java.WalmartPrep.Notification;

public class EmailNotification implements NotificationObserver{
    @Override
    public void update(String eventType, String orderId) {
        System.out.println("Sending out email : " + eventType + " " + orderId);
    }
}
