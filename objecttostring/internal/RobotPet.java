package com.inheritance.overriding.internal;

public class RobotPet {
    private   String model;
    private  int batteryLife;

    public RobotPet(String model, int batteryLife) {
        System.out.println("Running the RobotPet const");
        this.model = model;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return model + " " + batteryLife;
    }

    public void petdisp() {
        System.out.println("Model: " + this.model + ", Battery Life: " + this.batteryLife);
    }

//    public void userobotpet() {
//        System.out.println("Running the userobotpet method in the parent class");
//    }
}
