package com.chenzixin.sandbox.tutorial.basic;

/**
 * Created by Christen on 2017/2/8.
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");

        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}

class PrePostDemo {

    /**
     * The code System.out.println(++i); evaluates to 6, because the prefix version of ++ evaluates to the incremented value.
     * The next line, System.out.println(i++); evaluates to the current value (6), then increments by one.
     * So "7" doesn't get printed until the next line.
     * @param args
     */
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
        System.out.println(i);    // "7"
    }
}
