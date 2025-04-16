package com.inheritance.overriding.internal;

public class WeatherStation {
    private String location;
    private String model;

    public WeatherStation() {
        System.out.println("Running the WeatherStation const");
    }

    public void setWeatherStation(String location, String model) {
        this.location = location;
        this.model = model;
    }

    public String toString() {
        return location + " " + model;
    }

    public void weatherDisp() {
        System.out.println("Location is " + this.location + " Model is " + this.model);
    }

//    public void useweather() {
//        System.out.println("Running the useweather method in the WeatherStation class");
//    }
}
