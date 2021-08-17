package application;

public class StandardSensor implements Sensor {
    private int intParam;

    StandardSensor(int num) {
        this.intParam = num;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.intParam;
    }
}
