package com.inheritance.overriding.internal;

public class ProTreadmill extends Treadmill{
    public ProTreadmill(){
        System.out.println("Runninng the ProTreadmill const");
    }
    public void showtread(Treadmill treadmill){
        if(treadmill!=null){
            treadmill.usetread();
            if(treadmill instanceof SmartTreadmill){
                SmartTreadmill treadmill1=(SmartTreadmill) treadmill;
                treadmill1.maintread();
            }
            else{
                System.out.println("in treadmill smarttreadmill is not found");
            }
        }else{
            System.out.println("tradmill is null");
        }
    }
}
