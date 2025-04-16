package com.inheritance.overriding.internal;

public class Router {
    int rate;
    String brand;
    public Router(int rate,String brand){
        System.out.println("Running Router const");
        this.brand=brand;
        this.rate=rate;
    }
    public String toString(){
        return "rate"+this.rate+"brand"+this.brand;
    }
    public void routdisp(){
        System.out.println("Rate"+this.rate+"Brand"+this.brand);
    }
//    public void userouter(){
//        System.out.println("Runnig userouter method in parent class");
//    }
}
