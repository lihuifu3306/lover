package testjdk;

import testdemo.DisplayElement;
import testdemo.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  21:58
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;

    private float humidity;

    private float pressure;

    Observable observable;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature + "humidity" + humidity + "pressure" + pressure);

    }
}
