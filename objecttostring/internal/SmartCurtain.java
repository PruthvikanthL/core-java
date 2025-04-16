package com.inheritance.overriding.internal;

public class SmartCurtain {
    private String color;
    private String material;

    public SmartCurtain() {
        System.out.println("Running the SmartCurtain const");
    }

    public void setSmartCurtain(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String toString() {
        return color + " " + material;
    }

    public void curtainDisp() {
        System.out.println("Color is " + this.color + " Material is " + this.material);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartCurtain class");
//    }
}
