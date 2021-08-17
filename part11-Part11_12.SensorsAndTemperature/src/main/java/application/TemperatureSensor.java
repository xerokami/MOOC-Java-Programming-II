package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (isOn()) {
            int randomInt = new Random().nextInt(61) - 30;
            return randomInt;
        } else {
            throw new IllegalStateException("Cannot read when sensor is off!");
        }
    }
}
