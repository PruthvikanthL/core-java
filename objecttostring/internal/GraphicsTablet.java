package com.inheritance.overriding.internal;

public class GraphicsTablet {
    private String brand;
    private  int screenSize;

    public GraphicsTablet(String brand, int screenSize) {
        System.out.println("Running the GraphicsTablet const");
        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return brand + " " + screenSize + " inch";
    }

    public void tabletDisp() {
        System.out.println("Brand: " + this.brand + ", Screen Size: " + this.screenSize + " inch");
    }

//    public void usetablet() {
//        System.out.println("Running the usetablet method in the super class");
//    }
}
