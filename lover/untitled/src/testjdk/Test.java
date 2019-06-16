package testjdk;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  23:11
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1,2,3);
    }
}
