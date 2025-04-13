package com.inheritance.overriding.internal;

public class ProSmartPen extends SmartPen{
    public ProSmartPen(){
        System.out.println("Running the ProSmartPen const");
    }
    public void showsmart(SmartPen smartPen){
        if(smartPen!=null){
            smartPen.usepen();
            if(smartPen instanceof EliteSmartPen){
                EliteSmartPen elite=(EliteSmartPen) smartPen;
                elite.mainpen();
            }
            else{
                System.out.println("in smartpen EliteSmartPen is not found");
            }
        }else{
            System.out.println("smartpen is null");
        }
    }
}
