package com.inheritance.overriding.internal;

public class Laptop {
    int laptopnum;
    String laptopname;
    public Laptop(int laptopnum,String laptopname){
        System.out.println("no-arg Laptop const is running");
        this.laptopname=laptopname;
        this.laptopnum=laptopnum;

    }
    public String toString(){
        return "Laptopnumber"+laptopnum+"laptopname"+laptopname;
    }
    public void lapdisplay(){
        System.out.println("name"+this.laptopname+"number"+this.laptopnum);
    }
//    public void uselaptop(){
//        System.out.println("running uselaptop method in parent class Laptop");
//    }
}
