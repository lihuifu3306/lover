package test;

/**
 * @Author: 李惠福
 * @Create: 2019/7/17  18:13
 */
public class ArrayQueue {
    /**
     * 使用数组模拟队列
     */
    private int[] arr;
    /**
     * 最大值
     */
    private int maxSize;
    /**
     * 最前面的值
     */
    private int front;
    /**
     * 尾部的值
     */
    private int rear;

    public ArrayQueue(int arrMaxSize) {
        this.maxSize = arrMaxSize;
        this.arr = new int[arrMaxSize];
        // 指向队列头的前一个位置
        front = -1;
        // 队列尾部
        rear = -1;

    }

    /**
     * 判断队列是否满了
     * @return boolean
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 是否为空
     * @return boolean
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 添加数据
     * @param num
     */
    public void addQueue(int num) {
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加数据");
        }
        rear++;
        arr[rear] = num;
    }

    /**
     * 取数据
     * @return int
     */
    public int getQueue() throws Exception{
        if (isEmpty()) {
            throw new RuntimeException("队列为空g");
        }

        return arr[++front];
    }

    /**
     * 显示队列的全部数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println(" 队列为空，没有数据 ");
            return;
        }
        for (int i1 : arr) {
            System.out.println("arr = " + i1);
        }
    }

    /**
     * 取头部
     * @return int
     */
    public int headQueue() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front+1];
    }
}
