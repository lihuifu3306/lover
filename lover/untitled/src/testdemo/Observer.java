package testdemo;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  21:31
 */
public interface Observer {
    /**
     * 更新方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
