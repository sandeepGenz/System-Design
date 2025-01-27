package src.main.java.ObserverPattern;

import java.sql.SQLOutput;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    EmailAlertObserverImpl(String emailId , StockObservable observable)
    {
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId,observable);
    }

    public void sendEmail(String emailId , StockObservable observable) {
        System.out.println("Email sent to " + emailId);
    }
}
