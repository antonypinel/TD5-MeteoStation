package COO.TD5;

/**
 * 
 */
public abstract class Display implements Observer {

    private int temperature;
    private int pressure;
    private int humidity;

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Display() {
    }

    public abstract void print();


    public void update() {

    }

}