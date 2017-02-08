package com.chenzixin.sandbox.tutorial.basic;

import java.util.Arrays;

/**
 * Created by Christen on 2017/2/4.
 * http://doc.christen.cn/api/java/tutorial/java/nutsandbolts/arrays.html
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        //anArray[10] = 1100;

        System.out.println("Element at index 0: " + anArray[0]);
        // ArrayIndexOutOfBoundsException: 10
        //System.out.println("Element at index 11: " + anArray[10]);

        int[] anotherArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        System.out.println("Element at index 6: " + anotherArray[5]);
        System.out.println("The Array's length is: " + anotherArray.length);

        ArrayDemo ad = new ArrayDemo();
        ArrayDemo.InnerClass ic = ad.new InnerClass();
        ic.print("I come from an Inner Class.");
    }

    // Inner Class Example
    public class InnerClass {
        public void print(String str) {
            System.out.println(str);
        }
    }
}

class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}

class ArrayDemoCopy{
    public static void main(String[] args) {
        char[] fromArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] toArray = new char[5];
        System.arraycopy(fromArray, 1, toArray, 0, 5);
        System.out.println(new String(toArray));

        char[] copyToArray = Arrays.copyOfRange(fromArray, 1, 6);
        System.out.println(copyToArray);

        if(1>2 | 3<4){
            System.out.println(12);
        } else {
            System.out.println(13);
        }

    }
}

