package com.inheritance.overriding.internal;

public class VacuumCleaner {
    int accuracy;
    String brand;
    public VacuumCleaner(int accuracy,String brand){
        System.out.println("Running VacuumCleaner const");
        this.accuracy=accuracy;
        this.brand=brand;
    }
    public String toString(){
        return accuracy+brand;
    }
    public void vacdisp(){
        System.out.println("accuracy"+this.accuracy+"brand"+this.brand);
    }
//    public void usevaccum(){
//        System.out.println("Running usevaccumn method in the main class");
//    }
}
