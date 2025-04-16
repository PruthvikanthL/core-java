package com.inheritance.overriding.internal;

public class Intercom {
    private String model;
    private int volume;

    public Intercom() {
        System.out.println("Running the Intercom const");
    }

    public void setIntercom(String model, int volume) {
        this.model = model;
        this.volume = volume;
    }

    public String toString() {
        return model + " " + volume;
    }

    public void interDisp() {
        System.out.println("Model is " + this.model + " Volume is " + this.volume);
    }

//    public void useinter() {
//        System.out.println("Running the useinter method in the Intercom class");
//    }
}
