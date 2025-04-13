package com.inheritance.overriding.internal;

public class UltraSpeaker extends Speaker{
    public UltraSpeaker(){
        System.out.println("Running the UltraSpeaker const");
    }
    public void speak(Speaker speaker){
        if(speaker!=null){
            speaker.useseaker();
            if(speaker instanceof ProSpeaker) {
                ProSpeaker pro = (ProSpeaker) speaker;
                pro.mainseaker();
            }
                else{
                    System.out.println("Prospeaker is not found in speaker");
                }


    }else{
            System.out.println("speker is null");
        }
}}
