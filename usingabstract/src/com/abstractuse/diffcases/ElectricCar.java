package com.abstractuse.diffcases;

abstract class ElectricCar {

    public abstract void electdisp();
    public abstract void electshow();
    public void batterybackup() {
        System.out.println("Battery backup is running");
    }
    public void rechargetime(){
        System.out.println("rechargetime method is running ");
    }
}
