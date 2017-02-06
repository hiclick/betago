package com.chenzixin.sandbox.tutorial.oo;

/**
 * Created by Christen on 2017/2/4.
 * http://doc.christen.cn/api/java/tutorial/java/concepts/class.html
 */
public class Bicycle implements Bike{
    int cadence = 0; //踏频
    int speed = 0;
    int gear = 1; //齿轮 Fixed gear bicycle

    //Should be public
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;

    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStatus() {
        System.out.println("cadence: " + cadence +
                " speed: " + speed +
                " gear: " + gear);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "cadence=" + cadence +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
