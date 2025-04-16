package com.inheritance.overriding.internal;

public class ProjectorPro {
    private String brand;
    private int resolution;

    public ProjectorPro() {
        System.out.println("Running the ProjectorPro const");
    }

    public void setProjectorPro(String brand, int resolution) {
        this.brand = brand;
        this.resolution = resolution;
    }

    public String toString() {
        return brand + " " + resolution + "p";
    }

    public void projectorDisp() {
        System.out.println("Brand is " + this.brand + " Resolution is " + this.resolution + "p");
    }

//    public void usepro() {
//        System.out.println("Running the usepro method in the ProjectorPro class");
//    }
}
