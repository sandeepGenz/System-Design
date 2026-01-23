package src.main.java.FactoryPattern.Notification;

public class NotificationDriver {

    public static void main(String[] args) {
        Notification email_notification = NotificationFactory.createNotification("EMAIL");
        Notification sms_notification = NotificationFactory.createNotification("SMS");

        email_notification.send("HOLA EMAIL");
        sms_notification.send("HOLA SMS");

    }


}
