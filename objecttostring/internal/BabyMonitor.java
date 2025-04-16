package com.inheritance.overriding.internal;

public class BabyMonitor {
    private String monitorType;
    private String features;

    public BabyMonitor() {
        System.out.println("Running the BabyMonitor const");
    }

    public void setBabyMonitor(String monitorType, String features) {
        this.monitorType = monitorType;
        this.features = features;
    }

    public String toString() {
        return monitorType + " " + features;
    }

    public void monitorDisp() {
        System.out.println("Monitor Type is " + this.monitorType + " Features are " + this.features);
    }

//    public void usebaby() {
//        System.out.println("Running the usebaby method in the BabyMonitor class");
//    }
}
