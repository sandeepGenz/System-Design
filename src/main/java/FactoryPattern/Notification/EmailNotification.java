package src.main.java.FactoryPattern.Notification;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println(message + " " + " from email");
    }
}