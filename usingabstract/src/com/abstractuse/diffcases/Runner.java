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
        ElectricCar electricCar=new Speed("Olo");
        electricCar.batterybackup();
        electricCar.rechargetime();
        electricCar.electdisp();
        electricCar.electshow();
        Speed speed=new VehicleCost("Xiomi",120);
        speed.acce();

    }
}
