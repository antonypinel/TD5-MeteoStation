package COO.TD5;


import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class WeatherStation extends Subject {

    private List<Sensor> mySensors;
    private List<Observer> myObservers;


    public WeatherStation() {
        this.myObservers = new ArrayList<Observer>();
        this.mySensors = new ArrayList<Sensor>();

        mySensors.add(new TemperatureSensor());
        mySensors.add(new WindSensor());

        while (true) {
            System.out.println("Weather update : ");
            System.out.println("Temp = " + );
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