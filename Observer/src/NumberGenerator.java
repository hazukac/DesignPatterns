import java.util.Vector;
import java.util.Iterator;

public abstract class NumberGenerator {
    private Vector<Observer> observers = new Vector<Observer>();
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers() {
        Iterator itr = this.observers.iterator();
        while (itr.hasNext()) {
            Observer observer = (Observer)itr.next();
            observer.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}