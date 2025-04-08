package com.encap.encapsulation.internal;

public class Gym {
    private String name = "FitnessBeast";
    private String location = "Challakere";
    private int capacity = 50;
    private boolean hasTrainer = true;
    private String openHours = "6AMto10PM";

    void setName(String name) {
        this.name =name;
    }

    void setLocation(String location) {
        this.location =location;
    }

    void setCapacity(int capacity) {
        this.capacity =capacity;
    }

    void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer =hasTrainer;
    }

    void setOpenHours(String openHours) {
        this.openHours =openHours;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getHasTrainer() {
        return this.hasTrainer;
    }

    public String getOpenHours() {
        return this.openHours;
    }
}
