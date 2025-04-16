package com.inheritance.overriding.internal;

public class SmartWatch {
    int name;
    String brandname;
    public SmartWatch(int name,String brandname){
        System.out.println("Running SmartWatch const");
        this.name=name;
        this.brandname=brandname;
    }
    public String toString(){
        return "name"+this.name+"brandname"+this.brandname;
    }
    public void smartdisp(){
        System.out.println("name"+this.name+"brandname"+this.brandname);
    }
//    public void usesmartwatch(){
//        System.out.println("Running usesmartwatch method in the parent clas");
//    }
}
