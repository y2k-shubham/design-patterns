package week_2.observer.concrete;

import week_2.observer.specs.IObserver;
import week_2.observer.specs.Notification;

public class Subscriber implements IObserver {

    private String id;

    public Subscriber(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public void update(Notification notification) {
        System.out.println("---------------------");
        System.out.println("Subscriber-" + id + " received notification");
        System.out.println(notification);
        System.out.println("---------------------");
    }
}
