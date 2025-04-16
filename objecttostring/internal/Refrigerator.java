package com.inheritance.overriding.internal;

public class Refrigerator {
    int num;
    String refname;
    public Refrigerator(int num,String refname){
        System.out.println("no-arg Refrigerator const is running");
        this.num=num;
        this.refname=refname;
    }
    public String toString(){
        return "num"+num+"refname"+refname;
    }
    public void refname(){
        System.out.println("num"+this.num+"refname"+this.refname);
    }
//    public void useref(){
//        System.out.println("running useref method from parent class Refrigerator");
//    }
}
