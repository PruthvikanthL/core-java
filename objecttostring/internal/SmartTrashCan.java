package com.inheritance.overriding.internal;

public class SmartTrashCan {
    private String color;
    private int capacity;

    public SmartTrashCan() {
        System.out.println("Running the SmartTrashCan const");
    }

    public void setSmartTrashCan(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
    }

    public String toString() {
        return "Color: " + color + ", Capacity: " + capacity + " liters";
    }

    public void trashDetails() {
        System.out.println("Color: " + this.color + ", Capacity: " + this.capacity + " liters");
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the superclass");
//    }
}
