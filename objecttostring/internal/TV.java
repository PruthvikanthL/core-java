package com.inheritance.overriding.internal;

public class TV {
    int tvnumber;
    String Tvname;
    public TV(int tvnumber,String Tvname){
        //System.out.println("no-arg Tv const is running");
        this.tvnumber=tvnumber;
        this.Tvname=Tvname;

    }
    @Override
    public String toString(){
        return "tvnumber"+tvnumber+"Tvname"+Tvname;

    }
    public void tvdisplay(){
        System.out.println("Tvnumber"+this.tvnumber+"Tvname"+this.Tvname);
    }
}




//    public void usetv(){
//        System.out.println("use_tv method is running from Tv parent class");
//    }
//}
