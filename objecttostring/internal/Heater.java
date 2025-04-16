package com.inheritance.overriding.internal;

public class Heater {
    private    int temperature;
    private   String type;

    public Heater(int temperature, String type) {
        System.out.println("Running the Heater const");
        this.temperature = temperature;
        this.type = type;
    }

    @Override
    public String toString() {
        return temperature + type;
    }

    public void heaterdisp() {
        System.out.println("Temperature: " + this.temperature + ", Type: " + this.type);
    }

//    public void useheater() {
//        System.out.println("Running the useheater method in the parent class");
//    }
}
