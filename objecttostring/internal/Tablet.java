package com.inheritance.overriding.internal;

public class Tablet {
    int qunt;
    String name;
    public Tablet(int qunt,String name){
        System.out.println("Running Tablet cost");
        this.name=name;
        this.qunt= qunt;
    }
    public String toString(){
        return name+qunt;
    }
    public void tabdisp(){
        System.out.println("name"+this.name+"qunt"+this.qunt);
    }
//    public void usetablet(){
//        System.out.println("running usetablet method in parent class ");
//    }
}
