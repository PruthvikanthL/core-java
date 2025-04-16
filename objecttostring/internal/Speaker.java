package com.inheritance.overriding.internal;

public class Speaker {
    int num;
    String brand;
    public Speaker(int num,String brand){

        System.out.println("Runninng Speaker const");
        this.num=num;
        this.brand=brand;
    }
    public String toString(){
        return "num"+this.num+"brand"+this.brand;
    }
    public void spekdisp(){
        System.out.println("num"+this.num+"brand"+this.brand);
    }
//
//    public void useseaker(){
//        System.out.println("Running useseaker method ");
//    }
}
