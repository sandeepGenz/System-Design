package src.main.java.Homework.FactoryDP;

public class PushNotificationFactory extends NotificationFactory{

    @Override
    public Notification sendNotification() {
        return new PushNotification();
    }
}
