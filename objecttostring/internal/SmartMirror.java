package com.inheritance.overriding.internal;

public class SmartMirror {
    private   String brand;
    private   boolean touchScreen;

    public SmartMirror(String brand, boolean touchScreen) {
        System.out.println("Running the SmartMirror const");
        this.brand = brand;
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return brand + " " + touchScreen;
    }

    public void mirrorDisp() {
        System.out.println("Brand: " + this.brand + ", Touch Screen: " + this.touchScreen);
    }

//    public void usemirror() {
//        System.out.println("Running the usemirror method in the parent class");
//    }
}
