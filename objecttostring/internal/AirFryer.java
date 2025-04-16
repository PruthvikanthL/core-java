package com.inheritance.overriding.internal;

public class AirFryer {
    private int capacity;
    private String brand;

    public AirFryer() {
        System.out.println("Running the AirFryer const");
    }

    public void setAirFryer(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public String toString() {
        return capacity + " " + brand;
    }

    public void airDisp() {
        System.out.println("Capacity is " + this.capacity + " Brand is " + this.brand);
    }

//    public void useair() {
//        System.out.println("Running the useair method in the AirFryer class");
//    }
}
