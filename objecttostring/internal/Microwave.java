package com.inheritance.overriding.internal;

public class Microwave {
    int code;
    String name;
    public Microwave(int code,String name){
        System.out.println("Running Microwave class ");
        this.code=code;
        this.name=name;
    }
    public String toString(){
        return "code"+this.code+"name"+this.code;
    }
    public void micdisp(){
        System.out.println("code"+this.code+"name"+this.code);
    }
//    public void usemicrowave(){
//        System.out.println("Running usemicrowave method in the class Microwave ");
//    }
}
