package com.inheritance.overriding.internal;

public class POSMachine {
    private int size;
    private String name;
    public POSMachine(){
        System.out.println("Running the POSMachine const");
    }
//    public void usemachine(){
//        System.out.println("Running the usemachine in the super class");
//    }
    public void setPOSMachine(int size,String name){
        this.size=size;
        this.name=name;
    }
    public String toString(){
        return size+""+name;
    }
    public void machdisp(){
        System.out.println("size is"+this.size+"name is"+this.name);
    }
}
