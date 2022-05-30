package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    public ArrayList<Observer> observers;

    public double IBM, AAPL, GOOG;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        System.out.println("Observer " + (index + 1) + " deleted.");
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(IBM, AAPL, GOOG);
        }
    }

    public void setIBMPrice(double IBM) {
        this.IBM = IBM;
        notifyObserver();
    }

    public void setAAPLPrice(double AAPL) {
        this.AAPL = AAPL;
        notifyObserver();
    }

    public void setGOOGPrice(double GOOG) {
        this.GOOG = GOOG;
        notifyObserver();
    }
}
