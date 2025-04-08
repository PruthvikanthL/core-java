package com.encap.encapsulation.internal;

public class Jet {
    private String model = "FalconX";
    private int speed = 900;
    private double fuelCapacity = 2500.00;
    private String color = "Silver";
    private boolean isMilitary = true;

    void setModel(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }

    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getFuelCapacity() {
        return this.fuelCapacity;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getIsMilitary() {
        return this.isMilitary;
    }
}
