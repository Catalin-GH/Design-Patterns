package CreatedByhand;

public class Main
{
    public static void main(String[] args)
    {
        StockSubject stock = new StockSubject();
        
        StockObserver observer1 = new StockObserver(stock);
        
        stock.setBasePrice(123.99);
        stock.setReducedPrice(100.99);
        
        StockObserver observer2 = new StockObserver(stock);
        
        stock.setBasePrice(223.99);
        stock.setReducedPrice(200.99);
        
        stock.unregister(observer2);
        
        stock.setBasePrice(323.99);
        stock.setReducedPrice(300.99);
    }
}
