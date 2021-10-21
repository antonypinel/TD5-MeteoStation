package COO.TD5;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 
 */
public class WeatherStation extends Subject {

    private List<Sensor> mySensors;
    private List<Display> myObservers;


    public WeatherStation() {
        this.myObservers = new ArrayList<>();
        this.mySensors = new ArrayList<>();

        mySensors.add(new TemperatureSensor());
        mySensors.add(new WindSensor());
    }

    public void routine() throws InterruptedException {
        while (true) {
            int value = mySensors.get(0).readValues();
            if (value != mySensors.get(0).getOldValue()) {
                for (Display display:
                    myObservers) {
                    display.update(); //TO FINISH
                }
                mySensors.get(0).setOldValue(value);
            }
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