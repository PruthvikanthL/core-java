package com.inheritance.overriding.internal;

public class Toaster {
    int heat;
    String brand;
    public Toaster(int heat,String brand){
        System.out.println("Running the Toaster const");
        this.heat=heat;
        this.brand=brand;
    }
    public String toString(){
        return heat+brand;
    }
    public void toastdisp(){
        System.out.println("Heat"+this.heat+"brand"+this.brand);

    }
//    public void usetoaster(){
//        System.out.println("Running the usetoaster method in the superclass");
//    }
}
