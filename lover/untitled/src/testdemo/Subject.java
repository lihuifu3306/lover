package testdemo;

/**
 * @Author: 李惠福
 * @Create: 2019/6/16  21:30
 */
public interface Subject {
    /**
     * 注册
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 唤醒
     */
    void notifyObservers();
}
