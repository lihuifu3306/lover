package testdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  21:38
 */
public class WeatherData implements Subject {

    private float temperature;

    private float humidity;

    private float pressure;

    private List observers;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object observer : observers) {
            Observer o = (Observer) observer;
            o.update(temperature, humidity, pressure);
        }
    }


    public  void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", observers=" + observers +
                '}';
    }
}
