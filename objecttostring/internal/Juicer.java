package com.inheritance.overriding.internal;

public class Juicer {
    private String type;
    private int power;

    public Juicer() {
        System.out.println("Running the Juicer const");
    }

    public void setJuicer(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public String toString() {
        return type + " " + power;
    }

    public void juiceDisp() {
        System.out.println("Type is " + this.type + " Power is " + this.power);
    }

//    public void usejuice() {
//        System.out.println("Running the usejuice method in the Juicer class");
//    }
}
