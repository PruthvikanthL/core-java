package com.abstractuse.diffcases;

class Thermostat extends Refrigerator {
    @Override
    public void Refdisp(){
        System.out.println("Running the Refdisp in subclass");

    }
    @Override
    public void Refshow(){
        System.out.println("Running the Refshow method in subclass");
    }
}
