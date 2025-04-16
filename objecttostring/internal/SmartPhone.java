package com.inheritance.overriding.internal;

public class SmartPhone {
    int  smartnum;
    String smartname;
    public SmartPhone(int smartnum,String smartname){
        System.out.println("no-arg smartphone const is running");
        this.smartnum=smartnum;
        this.smartname=smartname;
    }
    public void smartdisp(){
        System.out.println("name"+this.smartname+"num"+this.smartnum);
    }

//    public void usesmartphone(){
//        System.out.println("running usessmartphone method is running from parent class smartphone");
//    }
}
