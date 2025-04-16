package com.inheritance.overriding.internal;

public class Soundbar {
    private String model;
    private int power;

    public Soundbar() {
        System.out.println("Running the Soundbar const");
    }

    public void setSoundbar(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String toString() {
        return model + " " + power;
    }

    public void soundDisp() {
        System.out.println("Model is " + this.model + " Power is " + this.power);
    }

    public void usesound() {
        System.out.println("Running the usesound method in the Soundbar class");
    }
}
