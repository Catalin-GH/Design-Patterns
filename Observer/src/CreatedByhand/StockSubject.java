package CreatedByhand;

import java.util.ArrayList;

public class StockSubject implements Subject
{
    private ArrayList<Observer> observers;
    private double basePrice;
    private double reducedPrice;
    
    public StockSubject()
    {
        observers = new ArrayList();
    }
    
    @Override
    public void register(Observer newObserver)
    {
        /*
         * Add new observer to the ArrayList
         */
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver)
    {
        int observerIndex = observers.indexOf(deleteObserver);
        
        System.out.println("Observer: " + (observerIndex+1) + " deleted.");
        
        // Delete the observer from the ArrayList
        observers.remove(deleteObserver);
    }

    @Override
    public void notifyObservers()
    {
        // Notify all observers
        for(Observer observer : observers)
        {
            observer.update(basePrice, reducedPrice);
        }
    }

    public void setBasePrice(double newBasePrice)
    {
        basePrice = newBasePrice;
        notifyObservers();
    }
    
    public void setReducedPrice(double newReducedPrice)
    {
        reducedPrice = newReducedPrice;
        notifyObservers();
    }
}
