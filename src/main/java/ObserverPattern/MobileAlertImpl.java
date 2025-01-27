package src.main.java.ObserverPattern;

public class MobileAlertImpl implements NotificationAlertObserver{

    String messageId = "SONA";
    StockObservable observable;

    MobileAlertImpl(String messageId , StockObservable observable)
    {
        this.messageId = messageId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessage(messageId,observable);
    }

    public void sendMessage(String messageId , StockObservable observable)
    {
        System.out.println("Message sent to " + messageId);
    }
}
