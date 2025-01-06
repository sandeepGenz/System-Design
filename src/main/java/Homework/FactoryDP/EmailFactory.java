package src.main.java.Homework.FactoryDP;

public class EmailFactory extends NotificationFactory{
    @Override
    public Notification sendNotification() {
        return new Email();
    }
}
