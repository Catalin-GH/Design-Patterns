package CreatedByhand;

/*
 * Using Subject interface for adding, deleting and updating observers
 */
public interface Subject
{
    void register(Observer obs);
    void unregister(Observer obs);
    void notifyObservers();
}
