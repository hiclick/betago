package com.chenzixin.sandbox.tutorial.oo;

/**
 * Created by Christen on 2017/2/6.
 */
public class MountainBicycle extends Bicycle {

    //new fields
    int transmission = 1; //变速器
    int shockAbsorber = 1; //减震器

    

    //new methods
    void changeTransmission (int newValue) {
        transmission = transmission + newValue;
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "transmission=" + transmission +
                ", shockAbsorber=" + shockAbsorber +
                ", cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
