package COO.TD5;

import java.util.Random;

public class WindSensor extends Sensor {
    @Override
    public int readValues() {
        Random random = new Random();
        int value;
        value = random.nextInt(200);
        return value;
    }
}
