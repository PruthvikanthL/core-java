package com.inheritance.overriding.internal;

public class SecurityCamera {
    private  String resolution;
    private  boolean isWireless;

    public SecurityCamera(String resolution, boolean isWireless) {
        System.out.println("Running the SecurityCamera const");
        this.resolution = resolution;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return resolution + " " + isWireless;
    }

    public void cameradisp() {
        System.out.println("Resolution: " + this.resolution + ", Wireless: " + this.isWireless);
    }

//    public void usesecuritycamera() {
//        System.out.println("Running the usesecuritycamera method in the parent class");
//    }
}
