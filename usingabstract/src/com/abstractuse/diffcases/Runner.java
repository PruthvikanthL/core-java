package com.abstractuse.diffcases;

public class Runner {
    public static void main(String[] args) {
        SmartPhone smartPhone=new Camera();
        smartPhone.touchscreendisplay();
        Rechargeable rechargeable=new Rechargeable();
        rechargeable.Lapdisp();
        rechargeable.keyboard();
        Thermostat thermostat=new Thermostat();
        thermostat.Refdisp();
        thermostat.Refshow();
        Laptops l1 = new Laptops("HP", 8);
        l1.keyboard();
    }
}
