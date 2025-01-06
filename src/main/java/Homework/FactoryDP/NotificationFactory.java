package src.main.java.Homework.FactoryDP;

public abstract class NotificationFactory {

    public abstract Notification sendNotification();
}

/*
public class NotificationFactory {
    public static Notification createNotification(String type) {
        if ("SMS".equalsIgnoreCase(type)) {
            return new SMS();
        } else if ("Email".equalsIgnoreCase(type)) {
            return new Email();
        } else if ("Push".equalsIgnoreCase(type)) {
            return new PushNotification();
        }
        throw new IllegalArgumentException("Invalid notification type: " + type);
    }
}

 */