package com.chenzixin.sandbox.tutorial.basic;

/**
 * Created by Christen on 2017/2/8.
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result); // 021221li
        result --;
        System.out.println(result);
        result ++;
        System.out.println(result);
        result = -result;
        System.out.println(result);

        boolean success = true; // 注意大小写 boolean
        System.out.println(success);
        System.out.println(!success);

    }
}
