package testdemo;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  21:58
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;

    private float humidity;

    private float pressure;


    private Subject weatherData;

    @Override
    public void display() {
        System.out.println("temperature = " + temperature + "humidity" + humidity + "pressure" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
