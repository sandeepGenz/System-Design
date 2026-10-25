package src.main.java.ObserverPattern.StockObserver;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{

    private StocksObservable stockObservable;
    private String emailID;

    public EmailNotificationObserverImpl(StocksObservable stockObservable, String emailID) {
        this.stockObservable = stockObservable;
        this.emailID = emailID;
    }

    @Override
    public void update() {
        sendEmail(emailID , "Product is available in stock hurry");
    }

    public void sendEmail(String emailID , String msg) {
        System.out.println("Main sent to " + emailID + msg);
    }
}
