package com.inheritance.overriding.internal;

public class DashCam {
    private String brand;
    private int resolution;

    public DashCam() {
        System.out.println("Running the DashCam const");
    }

    public void setDashCam(String brand, int resolution) {
        this.brand = brand;
        this.resolution = resolution;
    }

    public String toString() {
        return brand + " " + resolution;
    }

    public void dashDisp() {
        System.out.println("Brand is " + this.brand + " Resolution is " + this.resolution);
    }

    public void usedash() {
        System.out.println("Running the dash method in the DashCam class");
    }
}
