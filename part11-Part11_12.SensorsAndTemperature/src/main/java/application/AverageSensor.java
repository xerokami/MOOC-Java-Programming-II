package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors = new ArrayList<>();
    private ArrayList<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor: sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !(this.isOn())) {
            throw new IllegalStateException("Unable to read sensors");
        }

        int totalReadings = 0;
        for (Sensor sensor: sensors) {
            totalReadings += sensor.read();
        }

        int average = totalReadings / sensors.size();
        readings.add(average);
        return average;
    }
}
