package week_2.observer.concrete;

import week_2.observer.specs.IObserver;
import week_2.observer.specs.ISubject;
import week_2.observer.specs.Notification;

import java.util.ArrayList;
import java.util.List;

public class Blog implements ISubject {

    private List<IObserver> subscribers;
    private String name;

    public Blog(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        System.out.println("====================");
        System.out.println("Registered " + observer);
        System.out.println("====================");
        //
        this.subscribers.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        System.out.println("====================");
        System.out.println("Un-registered " + observer);
        System.out.println("====================");
        //
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        System.out.println("====================");
        System.out.println("Sending following notification");
        System.out.println(String.join(
                System.getProperty("line.separator"),
                String.format("[%s]", notification.getNotificationType().toString().toUpperCase()),
                String.format("\"%s\"", Notification.toTitleCase(notification.getHeader())),
                notification.getBody()
        ));
        System.out.println("====================");
        //
        for (IObserver observer : this.subscribers) {
            observer.update(notification);
        }
    }
}
