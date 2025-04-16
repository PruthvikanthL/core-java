package com.inheritance.overriding.internal;

public class Drone {
    int wings;
    String brand;
    public Drone(int wings,String brand){
        System.out.println("Running Drone const");
        this.wings=wings;
        this.brand=brand;
    }
    public String toString(){
        return wings+brand;
    }
    public void winddisp(){
        System.out.println("wings"+this.wings+"brand"+this.brand);
    }
//    public void usedrone(){
//        System.out.println("Runing usedrone method in the Drone class");
//    }
}
