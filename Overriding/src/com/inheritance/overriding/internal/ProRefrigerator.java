package com.inheritance.overriding.internal;

public class ProRefrigerator extends Refrigerator{
    public ProRefrigerator(){
        System.out.println("Running the ProRefrigerator const");
    }
    public void proshow(Refrigerator refrigerator){
        if(refrigerator!=null){
            refrigerator.useref();
            if(refrigerator instanceof UltraRefrigerator){
                UltraRefrigerator ultra=(UltraRefrigerator) refrigerator;
                ultra.maintainRef();
            }
            else{
                System.out.println("in Refrigerator UltraRefrigerator not found");
            }
        }else{
            System.out.println("Refrigerator not found");
        }
    }
}
