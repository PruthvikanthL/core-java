package com.inheritance.overriding.internal;

public class Oven {
    int heatper;
    String brand;
    public Oven(int heatper,String brand){
        System.out.println("Running the Oven const");
        this.heatper=heatper;
        this.brand=brand;
    }
    public String toString(){
        return heatper+brand;
    }
    public void ovendisp(){
        System.out.println("heatpercentage"+this.heatper+"brand"+this.heatper);
    }
//    public void useoven(){
//        System.out.println("Running the useoven method in the parent class");
//    }
}
