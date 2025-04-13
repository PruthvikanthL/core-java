package com.inheritance.overriding.internal;

public class ProFan extends Fan{
    public ProFan(){
        System.out.println("Running the ProFan const");
    }
    public void showfan(Fan fan){
        if(fan!=null){
            fan.usefan();
            if(fan instanceof SmartFan){
                SmartFan fan1=(SmartFan) fan;
                fan1.mainfan();
            }else{
                System.out.println("in fan smartfan not foung");
            }
        }else{
            System.out.println("fan is null");
        }
    }
}
