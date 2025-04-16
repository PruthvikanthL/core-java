package com.inheritance.overriding.internal;

public class Projector {
    int size;
    String brand;
    public Projector(int size,String brand){
        System.out.println("Running the Projector const");
        this.size=size;
        this.brand=brand;
    }
    public String toString(){
        return size+brand;
    }
    public void prodisp(){
        System.out.println("size"+this.size+"Brand"+this.brand);
    }
//    public void useprojector(){
//        System.out.println("Running the useprojector method in parent class");
//    }
}
