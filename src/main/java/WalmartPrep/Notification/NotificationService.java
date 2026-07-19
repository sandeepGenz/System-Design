package src.main.java.WalmartPrep.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    List<NotificationObserver> observers = new ArrayList<>();

    public void subscribe(NotificationObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(NotificationObserver observer) {
        observers.remove(observer);
    }

    public void placeOrder(String orderId) {
        System.out.println("Order : " + orderId + " saved to db ");
        notifySubscribers("ORDER_PLACED" , orderId);
    }

    public void notifySubscribers(String eventType , String orderId) {
        for(NotificationObserver observer : observers) {
            observer.update(eventType, orderId);
        }
    }
}
