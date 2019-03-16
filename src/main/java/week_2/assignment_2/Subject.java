package week_2.assignment_2;

public interface Subject {

    public abstract void registerObserver(Observer observer);

    public abstract void unregisterObserver(Observer observer);

    public void notifyObservers();
}
