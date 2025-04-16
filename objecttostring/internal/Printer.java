package com.inheritance.overriding.internal;

public class Printer {
    int num;
    String brandname;
    public Printer(int num,String brandname){
        System.out.println("Runnuning Printer cosnt");
        this.num=num;
        this.brandname=brandname;
    }
    public String toString(){
        return "num"+num+"brandname"+brandname;
    }
    public void pridisp(){
        System.out.println("num"+this.num+"brandname"+this.brandname);
    }
//    public void useprinter(){
//        System.out.println("running useprinter method in printer class");
//        System.out.println("num"+this.num+"brandname"+this.brandname);
//    }
}
