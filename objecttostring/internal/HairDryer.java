package com.inheritance.overriding.internal;

public class HairDryer {
    private  int power;
    private   String model;

    public HairDryer(int power, String model) {
        System.out.println("Running the HairDryer const");
        this.power = power;
        this.model = model;
    }

    @Override
    public String toString() {
        return power + model;
    }

    public void hairdryerdisp() {
        System.out.println("Power: " + this.power + ", Model: " + this.model);
    }

//    public void usehairdryer() {
//        System.out.println("Running the usehairdryer method in the parent class");
//    }
}
