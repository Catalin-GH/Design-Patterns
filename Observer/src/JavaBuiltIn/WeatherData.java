package JavaBuiltIn;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;

    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();
        notifyObservers(); //using the PULL method

    }

    public void setMesurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}

