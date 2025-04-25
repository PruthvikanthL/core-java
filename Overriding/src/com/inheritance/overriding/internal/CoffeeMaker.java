package com.inheritance.overriding.internal;

public class CoffeeMaker {
    int qunt;
    String brand;
    public CoffeeMaker(int qunt,String brand){
        System.out.println("Running CoffeeMaker const");
        this.brand=brand;
        this.qunt=qunt;
    }
    public String toString(){
        return qunt+brand;
    }
    public void coffdisp(){
        System.out.println("qunt"+this.qunt+"Brand"+this.brand);
    }
//    public void usecoffe(){
//        System.out.println("Running the usecoffee method in parent class");
//    }
}
