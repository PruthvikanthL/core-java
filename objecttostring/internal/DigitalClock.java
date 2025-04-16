package com.inheritance.overriding.internal;

public class DigitalClock {
    private String timeFormat;
    private String brand;

    public DigitalClock() {
        System.out.println("Running the DigitalClock const");
    }

    public void setDigitalClock(String timeFormat, String brand) {
        this.timeFormat = timeFormat;
        this.brand = brand;
    }

    public String toString() {
        return timeFormat + " " + brand;
    }

    public void clockDisp() {
        System.out.println("Time Format is " + this.timeFormat + " Brand is " + this.brand);
    }

//    public void usedigital() {
//        System.out.println("Running the usedigital method in the DigitalClock class");
//    }
}
