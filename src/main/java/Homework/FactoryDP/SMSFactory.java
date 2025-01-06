package src.main.java.Homework.FactoryDP;

public class SMSFactory extends NotificationFactory{
    @Override
    public Notification sendNotification() {
        return new SMS();
    }
}
