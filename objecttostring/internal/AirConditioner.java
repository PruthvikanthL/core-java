package com.inheritance.overriding.internal;

public class AirConditioner {
    int barcode;
    String brandname;
    public AirConditioner(int barcode,String brandname){
        System.out.println("no-arg AirConditioner const is running");
        this.barcode=barcode;
        this.brandname=brandname;
    }
    public String toString(){
        return "barcode"+this.barcode+"brandname"+this.brandname;
    }
    public void airdisp(){
        System.out.println("Barcode"+this.barcode+"Brandname"+this.brandname);
    }
//    public void useaircondtioner(){
//        System.out.println("running useaircondtioner method from parent class Airconditioner");
//    }
}
