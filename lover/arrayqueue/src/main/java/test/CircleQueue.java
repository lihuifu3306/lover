package test;

/**
 * @Author: 李惠福
 * @Create: 2019/7/19  11:08
 */
public class CircleQueue {
    /**
     * 数组
     */
    private int[] arr;
    /**
     * 尾部
     */
    private int rear;
    /**
     * 头部
     */
    private int front;
    /**
     * 最大值
     */
    private int maxSize;

    public CircleQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断是否为空
     * @return boolean
     */
    public boolean isEmpty() {
        return front == rear;
    }
    /**
     * 判断是否已满
     * return boolean
     */
    public boolean isFull() {
        return (rear+1) % maxSize == front;
    }

    /**
     * 添加元素
     * @param n
     * @throws RuntimeException
     */
    public void addQueue(int n)throws RuntimeException {
        if (isFull()) {
            throw new RuntimeException("队列已满，不能再添加数据了");
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    /**
     * 取出数据
     */
    public int getQueue()throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，不能再取了");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    /**
     * 展示所有数据
     * @throws RuntimeException
     */
    public void showQueue()throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        // 遍历数据
        for (int i = front; i < front + getSize(); i++) { // ？？？
            System.out.println("arr["+i % maxSize + "]" + arr[i % maxSize]);
        }
    }

    /**
     * 有效数据的数量
     * @return int
     */
    public int getSize() {
        return (rear + maxSize -front) % maxSize;
    }

    /**
     * 展示头
     */
    public void showHead() {
        System.out.println(arr[front % maxSize]);
    }
}
