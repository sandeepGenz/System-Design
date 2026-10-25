package src.main.java.ObserverPattern.StockObserver;

public class SmsNotificationAlertObserverImpl implements NotificationAlertObserver{

    private StocksObservable stocksObservable;
    private String mobileNumber;

    public SmsNotificationAlertObserverImpl(StocksObservable stocksObservable, String mobileNumber) {
        this.stocksObservable = stocksObservable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update() {
        sendSms(mobileNumber, "Stock is up hurry bro");
    }

    public void sendSms(String mobileNumber , String msg) {
        System.out.println("SMS sent to " + mobileNumber + msg);
    }
}
