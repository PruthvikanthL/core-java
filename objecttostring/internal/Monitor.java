package com.inheritance.overriding.internal;

public class Monitor {
    private   int size;
    private String resolution;

    public Monitor(int size, String resolution) {
        System.out.println("Running the Monitor const");
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return size + resolution;
    }

    public void monitordisp() {
        System.out.println("Size: " + this.size + ", Resolution: " + this.resolution);
    }

//    public void usemonitor() {
//        System.out.println("Running the usemonitor method in the parent class");
//    }
}
