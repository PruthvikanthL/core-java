package com.inheritance.overriding.internal;

public class SmartLight {
    int intensity;
    String brand;
    public SmartLight(int intensity,String brand){
        System.out.println("Running SmartLight const");
        this.brand=brand;
        this.intensity=intensity;
    }
    public String toString(){
        return intensity+brand;
    }
    public void smartdisp(){
        System.out.println("intensity"+this.intensity+"brand"+this.brand);
    }
//    public void usesmartlight(){
//        System.out.println("Running usesmartlight method int the parent clas");
//    }
}
