package com.inheritance.overriding.internal;

public class SmartThermostat {
    private int temperature;
    private String model;

    public SmartThermostat() {
        System.out.println("Running the SmartThermostat const");
    }

    public void setSmartThermostat(int temperature, String model) {
        this.temperature = temperature;
        this.model = model;
    }

    public String toString() {
        return temperature + "" + model;
    }

    public void thermDisp() {
        System.out.println("Temperature is " + this.temperature + " Model is " + this.model);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartThermostat class");
//    }
}
