package com.chenzixin.sandbox.tutorial.oo;

/**
 * Created by Christen on 2017/2/4.
 */
public class BicycleDemo {
    public static void main(String[] args) {
        //Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        //Invoke methods on
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStatus();
        System.out.println(bike1);

        bike2.changeCadence(40);
        bike2.speedUp(20);
        bike2.changeGear(2);
        bike2.changeCadence(60);
        bike2.speedUp(30);
        bike2.changeGear(4);
        bike2.applyBrakes(10);
        bike2.printStatus();
        System.out.println(bike2);

        MountainBicycle bike3 = new MountainBicycle();
        bike3.changeCadence(5);
        bike3.changeTransmission(1);
        bike3.speedUp(100);
        System.out.println(bike3);

    }
}
