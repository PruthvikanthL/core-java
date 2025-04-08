package com.encap.encapsulation.internal;

public class Garage {
    private String name="Adarsh Garage";
    private int capacity=20;
    private String location="Benglore";
    private boolean hasSecurity=true;
    private int openHours=12;

    void setName(String name){
        this.name=name;
    }

    void setCapacity(int capacity){
        this.capacity=capacity;
    }

    void setLocation(String location){
        this.location=location;
    }

    void setHasSecurity(boolean hasSecurity){
        this.hasSecurity=hasSecurity;
    }

    void setOpenHours(int openHours){
        this.openHours=openHours;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getLocation(){
        return this.location;
    }

    public boolean getHasSecurity(){
        return this.hasSecurity;
    }

    public int getOpenHours(){
        return this.openHours;
    }
}
