package com.inheritance.overriding.internal;

public class SlowCooker {
    private int capacity;
    private String color;

    public SlowCooker() {
        System.out.println("Running the SlowCooker const");
    }

    public void setSlowCooker(int capacity, String color) {
        this.capacity = capacity;
        this.color = color;
    }

    public String toString() {
        return capacity + " " + color;
    }

    public void cookDisp() {
        System.out.println("Capacity is " + this.capacity + " Color is " + this.color);
    }

//    public void usecook() {
//        System.out.println("Running the usecook method in the SlowCooker class");
//    }
}
