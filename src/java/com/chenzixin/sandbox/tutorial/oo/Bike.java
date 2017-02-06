package com.chenzixin.sandbox.tutorial.oo;

/**
 * Created by Christen on 2017/2/6.
 */
public interface Bike {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
