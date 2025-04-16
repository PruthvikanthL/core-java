package com.inheritance.overriding.internal;

public class GarageDoorOpener {
    private String doorType;
    private String material;

    public GarageDoorOpener() {
        System.out.println("Running GarageDoorOpener const");
    }

    public void setGarageDoorOpener(String doorType, String material) {
        this.doorType = doorType;
        this.material = material;
    }

    public String toString() {
        return doorType + " " + material;
    }

    public void doorDisp() {
        System.out.println("Door Type is " + this.doorType + " Material is " + this.material);
    }

//    public void usegarage() {
//        System.out.println("Running the usegarage method in the GarageDoorOpener class");
//    }
}
