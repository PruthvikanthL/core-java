package com.interfaceusing.using.external;

import com.interfaceusing.using.internal.interimple.Keyboard;

public class HPLaptop implements Keyboard {
    @Override
    public void Touchpad() {
        System.out.println("Touchpas is runninng the HPlaptop class");
    }

    @Override
    public void Weight() {
        System.out.println("Weight is running in the HPLaptop class");
    }

    @Override
    public void Battery() {
        System.out.println("Battery is running in the HPLaptop class");
    }

    @Override
    public void RAM() {
        System.out.println("RAM is running in the HPLaptop class");
    }

    @Override
    public void Screen() {
        System.out.println("Screen is running in the HPLaptop class");
    }
}
