package test;

import java.util.Scanner;

/**
 * @Author: 李惠福
 * @Create: 2019/7/17  19:16
 */
public class TestCircle {
    public static void main(String[] args) {
        CircleQueue queue = new CircleQueue(4);
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
                    try {
                        queue.showQueue();
                    } catch (Exception e) {
                        System.out.println("e = " + e.getMessage());
                    }
                    break;
                case  'a':
                    try {
                        System.out.println("请输入一个正数");
                        int n = scanner.nextInt();
                        queue.addQueue(n);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g':
                    int queue1 = 0;
                    try {
                        queue1 = queue.getQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("head = " + queue1);

                    break;
                case 'e':
                    loop = false;
                    break;
                case 'h':
                    try {
                        queue.showHead();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                default:
            }
        }
        System.out.println("退出程序");
    }
}
