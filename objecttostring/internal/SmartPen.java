package com.inheritance.overriding.internal;

public class SmartPen {
    private String color;
    private String brand;

    public SmartPen() {
        System.out.println("Running the SmartPen const");
    }

    public void setSmartPen(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String toString() {
        return "Color: " + color + ", Brand: " + brand;
    }

    public void penDetails() {
        System.out.println("Color: " + this.color + ", Brand: " + this.brand);
    }

//    public void usepen() {
//        System.out.println("Running the usepen in the super class");
//    }
}
