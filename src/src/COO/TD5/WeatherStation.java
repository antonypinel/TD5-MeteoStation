package COO.TD5;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
public class WeatherStation extends Subject {

    private List<Sensor> mySensors;
    private List<Observer> myObservers;


    public WeatherStation() throws InterruptedException {
        this.myObservers = new ArrayList<Observer>();
        this.mySensors = new ArrayList<Sensor>();

        mySensors.add(new TemperatureSensor());
        mySensors.add(new WindSensor());

        while (true) {
            System.out.println("Weather update : ");
            System.out.println("Temp = " + mySensors.get(0).readValues());
            System.out.println("Wind = " + mySensors.get(1).readValues());
            TimeUnit.SECONDS.sleep(10);
        }
    }

    @Override
    public void attacher(Observer o) {
        myObservers.add(o);
    }

    @Override
    public void detacher(Observer o) {
        myObservers.remove(o);
    }

    @Override
    public void notifier() {

    }

}