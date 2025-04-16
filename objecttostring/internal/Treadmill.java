package com.inheritance.overriding.internal;

public class Treadmill {
    private int speed;
    private String brand;

    public Treadmill() {
        System.out.println("Running the Treadmill const");
    }

    public void setTreadmill(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public String toString() {
        return speed + " " + brand;
    }

    public void treadDisp() {
        System.out.println("Speed is " + this.speed + " Brand is " + this.brand);
    }

//    public void usetread() {
//        System.out.println("Running the usetread method in the Treadmill class");
//    }
}
