package src.main.java.ObserverPattern.LogDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<LogObserver> observers = new ArrayList<>();

    public void addObserver(LogObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LogObserver observer) {
        observers.remove(observer);
    }

    public void log(String message) {
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for(LogObserver observer : observers) {
            observer.log(message);
        }
    }
}
