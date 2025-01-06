package src.main.java.Homework.FactoryDP;

public class User {
    public static void main(String[] args)
    {
        NotificationFactory smsNotification = new SMSFactory();
        Notification smsNotif = smsNotification.sendNotification();

        smsNotif.messageNotification();

        NotificationFactory pushNotification = new PushNotificationFactory();
        Notification pushNotif = pushNotification.sendNotification();

        pushNotif.messageNotification();

        NotificationFactory emailNotification = new EmailFactory();
        Notification emailNotif = emailNotification.sendNotification();

        emailNotif.messageNotification();


    }
}

/*
public class User {
    public static void main(String[] args) {
        Notification smsNotif = NotificationFactory.createNotification("SMS");
        smsNotif.messageNotification();

        Notification emailNotif = NotificationFactory.createNotification("Email");
        emailNotif.messageNotification();

        Notification pushNotif = NotificationFactory.createNotification("Push");
        pushNotif.messageNotification();
    }
}

 */
