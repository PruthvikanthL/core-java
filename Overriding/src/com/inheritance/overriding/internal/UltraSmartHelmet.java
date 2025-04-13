package com.inheritance.overriding.internal;

public class UltraSmartHelmet extends SmartHelmet{
    public UltraSmartHelmet(){
        System.out.println("Runninng the UltraSmartHelmet const");
    }
    public void showhel(SmartHelmet smartHelmet){
        if(smartHelmet!=null){
            smartHelmet.usesmart();
            if(smartHelmet instanceof ProSmartHelmet){
                ProSmartHelmet hel=(ProSmartHelmet) smartHelmet;
                hel.mainsmart();
            }
            else{
                System.out.println("in Smarthelmet ProSmartHelmet is found");
            }
        }else{
            System.out.println("smarthelmet is null");
        }
    }
}
