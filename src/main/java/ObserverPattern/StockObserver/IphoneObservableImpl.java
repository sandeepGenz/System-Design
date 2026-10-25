package src.main.java.ObserverPattern.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();

    int stock = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(this.stock == 0) {
            notifySubscribers();
        }

        this.stock = newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stock;
    }
}
