package COO.TD5;

/**
 * 
 */
public abstract class Subject {

    /**
     * Default constructor
     */
    public Subject() {
    }


    /**
     * @param o
     */
    public abstract void attacher(Observer o);

    /**
     * @param o
     */
    public abstract void detacher(Observer o);

    /**
     * 
     */
    public abstract void notifier();

}