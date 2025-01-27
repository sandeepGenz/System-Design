package src.main.java.ObserverPattern;

public class Driver {

    public static void main(String[] args)
    {

        StockObservable IphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("sandeepbk01@gmail.com",IphoneStockObservable);

        NotificationAlertObserver observer2 = new MobileAlertImpl("spark001",IphoneStockObservable);

        IphoneStockObservable.add(observer1);
        IphoneStockObservable.add(observer2);

        IphoneStockObservable.setStockCount(100);

    }

}
