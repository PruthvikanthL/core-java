package com.inheritance.overriding.internal;

public class WashingMachine {
    int code;
    String washname;
    public WashingMachine(int code,String washname){
        System.out.println("no-arg WashingMachine const is running");
        this.code=code;
        this.washname=washname;
    }
    public String toString(){
        return "code"+this.code+"washname"+this.washname;
    }
    public void washdisp(){
        System.out.println("code"+this.code+"washname"+this.washname);
    }
//    public void usewashmachine(){
//        System.out.println("usewashmachine method is running from WashingMachine class ");
//    }
}
