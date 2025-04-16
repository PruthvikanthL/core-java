package com.inheritance.overriding.internal;

public class GameConsole {
    private  String model;
    private  String brand;

    public GameConsole(String model, String brand) {
        System.out.println("Running the GameConsole const");
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return model + brand;
    }

    public void consoledisp() {
        System.out.println("Model: " + this.model + ", Brand: " + this.brand);
    }

//    public void useconsole() {
//        System.out.println("Running the useconsole method in the parent class");
//    }
}
