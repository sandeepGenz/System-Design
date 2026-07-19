package src.main.java.WalmartPrep.Notification;

public interface NotificationObserver {
    void update(String eventType , String orderId);
}
