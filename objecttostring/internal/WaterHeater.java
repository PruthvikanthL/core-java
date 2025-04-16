package com.inheritance.overriding.internal;

public class WaterHeater {
    private int capacity;
    private String type;

    public WaterHeater() {
        System.out.println("Running the WaterHeater const");
    }

    public void setWaterHeater(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public String toString() {
        return capacity + " " + type;
    }

    public void waterDisp() {
        System.out.println("Capacity is " + this.capacity + " Type is " + this.type);
    }

//    public void water() {
//        System.out.println("Running the water method in the WaterHeater class");
//    }
}
