package com.inheritance.overriding.internal;

public class AirHumidifier {
    private int capacity;
    private String brand;

    public AirHumidifier() {
        System.out.println("Running the AirHumidifier const");
    }

    public void setAirHumidifier(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public String toString() {
        return capacity + " " + brand;
    }

    public void humidDisp() {
        System.out.println("Capacity is " + this.capacity + " Brand is " + this.brand);
    }

//    public void useair() {
//        System.out.println("Running the useair method in the AirHumidifier class");
//    }
}
