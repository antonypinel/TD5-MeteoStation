package COO.TD5;

import java.util.Random;

public class TemperatureSensor extends Sensor {
    @Override
    public int readValues() {
        Random random = new Random();
        int value;
        value = -30 + random.nextInt(50+30);
        return value;
    }
}
