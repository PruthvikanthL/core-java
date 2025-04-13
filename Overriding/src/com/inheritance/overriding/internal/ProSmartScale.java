package com.inheritance.overriding.internal;

public class ProSmartScale extends SmartScale{
    public ProSmartScale(){
        System.out.println("Running the ProSmartScale const");
    }
    public void showsmart(SmartScale smartScale){
        if(smartScale!=null){
            smartScale.usesmart();
            if(smartScale instanceof UltraSmartScale){
                UltraSmartScale smart=(UltraSmartScale) smartScale;
                smart.mainsmart();
            }else{
                System.out.println("in smartscale ultrasmartscale is not found");
            }}else{
                System.out.println("smartscale in null");
            }

    }
}
