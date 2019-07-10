package com.lover.util.fbna;

import java.time.*;

/**
 * @Author: 李惠福
 * @Create: 2019/7/10  16:18
 */
public class BirthRabbit {

    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();

        int sum = sum(10000);

        long l1 = System.currentTimeMillis();
        long l2 = l1 - l;
        System.out.println("l1 = " + l2);
        System.out.println("sum = " + sum);

    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    private static int sumNum(int t) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            count = count + i;
        }
        return count;
    }
}

