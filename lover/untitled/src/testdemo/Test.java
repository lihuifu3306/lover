package testdemo;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  22:09
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1f, 2f, 3f);
    }
}
