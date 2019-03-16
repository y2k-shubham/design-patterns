package week_2.observer.specs;

public interface ISubject {

    public abstract void registerObserver(IObserver observer);

    public abstract void unregisterObserver(IObserver observer);

    public abstract void notifyObservers(Notification notification);
}
