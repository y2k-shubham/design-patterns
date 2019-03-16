package week_2.assignment_2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private List<Observer> observers;
    private String channelName;
    private String status;

    public Channel(String channelName) {
        this.channelName = channelName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Channel '" + this.channelName + "' sending notifications");
        for (Observer observer : this.observers) {
            observer.update(this.status);
        }
    }

    public String getChannelName() {
        return channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("Channel '" + this.channelName + "' updated status to '" + this.status + "'");
        notifyObservers();
    }
}
