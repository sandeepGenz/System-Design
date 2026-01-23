package src.main.java.FactoryPattern.Notification;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println(message + " " + "from sms");
    }
}