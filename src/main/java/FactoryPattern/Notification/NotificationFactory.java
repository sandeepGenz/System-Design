package src.main.java.FactoryPattern.Notification;

public class NotificationFactory {
    public static Notification createNotification (String type) {
        if(type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if(type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        } else {
            throw new UnsupportedOperationException("This type of notification is not supported");
        }
    }
}