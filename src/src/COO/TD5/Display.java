package COO.TD5;

/**
 * 
 */
public abstract class Display implements Observer {

    /**
     * Default constructor
     */
    public Display() {
    }

    /**
     * 
     */
    private int temperature;

    /**
     * 
     */
    private int pressure;

    /**
     * 
     */
    private int humidity;

    /**
     * 
     */
    public abstract void print();

    /**
     * 
     */
    public void update() {
        // TODO implement here
    }

}