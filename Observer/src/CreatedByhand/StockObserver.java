package CreatedByhand;

public class StockObserver implements Observer
{
    private double basePrice;
    private double reducedPrice;
    
    private static int observerIDTracker = 0;
    
    private int observerID;
    
    private Subject stockSubject;
    
    public StockObserver(Subject stockSubject)
    {
        this.stockSubject = stockSubject;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer: " + this.observerID);
        stockSubject.register(this);
    }
    
    @Override
    public void update(double basePrice, double reducedPrice)
    {
        this.basePrice = basePrice;
        this.reducedPrice = reducedPrice;
        
        printPrices();
    }
    
    public void printPrices()
    {
        System.out.println(observerID 
                + "\nBase price: " + basePrice 
                + "\nReduced price: " + reducedPrice 
                + "\n");
    }
}
