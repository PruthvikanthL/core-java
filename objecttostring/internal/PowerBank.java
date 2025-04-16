package com.inheritance.overriding.internal;

public class PowerBank {
    private String model;
    private int capacity;

    public PowerBank(String model, int capacity) {
        System.out.println("Running the PowerBank const");
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return model + " " + capacity + " mAh";
    }

    public void powerBankDisp() {
        System.out.println("Model: " + this.model + ", Capacity: " + this.capacity + " mAh");
    }

//    public void usepowerbank() {
//        System.out.println("Running the usepowerbank method in parent class");
//    }
}
