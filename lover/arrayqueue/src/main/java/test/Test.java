package test;

import java.util.Scanner;

/**
 * @Author: 李惠福
 * @Create: 2019/7/17  19:16
 */
public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输入一个菜单
        while (loop) {
            System.out.println("s:显示队列");
            System.out.println("a:添加数据");
            System.out.println("g:取出数据");
            System.out.println("e:退出程序");
            System.out.println("h:取出头数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case  'a':
                    try {
                        System.out.println("请输入一个正数");
                        int n = scanner.nextInt();
                        queue.addQueue(n);
                    } catch (Exception e) {
                        System.out.println("e.getMessage() = " + e.getMessage());
                    }
                    break;
                case 'g':
                    int queue1 = 0;
                    try {
                        queue1 = queue.getQueue();
                    } catch (Exception e) {
                        System.out.println("e.printStackTrace() = "+ e.getMessage());
                    }
                    System.out.println("queue1 = " + queue1);

                    break;
                case 'e':
                    loop = false;
                    break;
                case 'h':
                    try {
                        int i = queue.headQueue();
                        System.out.println("i = " + i);
                    } catch (Exception e) {
                        System.out.println("e.getMessage() = " + e.getMessage());
                    }
                    
                    break;
                default:
            }
        }
        System.out.println("退出程序");
    }
}
