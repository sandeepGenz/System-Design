package src.main.java.ObserverPattern.StockObserver;

public class Store {
    public static void main(String[] args) {

        // observables
        StocksObservable iphoneStock = new IphoneObservableImpl();

        // create observers
        NotificationAlertObserver observer1 = new EmailNotificationObserverImpl(iphoneStock,"xyz.com");
        NotificationAlertObserver observer2 = new EmailNotificationObserverImpl(iphoneStock,"xyzz.com");
        NotificationAlertObserver observer3 = new SmsNotificationAlertObserverImpl(iphoneStock,"9898989898");

        iphoneStock.add(observer1);
        iphoneStock.add(observer2);
        iphoneStock.add(observer3);

        iphoneStock.setStockCount(1000);
        iphoneStock.setStockCount(0);
        iphoneStock.setStockCount(10000);

//        iphoneStock.notifySubscribers();
    }
}
