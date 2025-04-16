package com.inheritance.overriding.internal;

public class Fan {
    private  int speed;
    private  String color;

    public Fan(int speed, String color) {
        System.out.println("Running the Fan const");
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return speed + color;
    }

    public void fandisp() {
        System.out.println("Speed: " + this.speed + ", Color: " + this.color);
    }

//    public void usefan() {
//        System.out.println("Running the usefan method in the parent class");
//    }
}
