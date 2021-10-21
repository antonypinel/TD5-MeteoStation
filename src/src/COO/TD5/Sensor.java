package COO.TD5;


/**
 * 
 */
public abstract class Sensor {

    private int oldValue = Integer.MIN_VALUE;

    public Sensor() {
        this.oldValue = oldValue;
    }

    public abstract int readValues();

    public int getOldValue() {
        return oldValue;
    }

    public void setOldValue(int oldValue) {
        this.oldValue = oldValue;
    }
}