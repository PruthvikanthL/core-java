package com.inheritance.overriding.internal;

public class ProWaterHeater extends WaterHeater{
    public ProWaterHeater(){
        System.out.println("Running the ProWaterHeater const");
    }
    public void showwater(WaterHeater waterHeater){
        if(waterHeater!=null){
            waterHeater.water();
            if(waterHeater instanceof UltraWaterHeater){
                UltraWaterHeater water=(UltraWaterHeater) waterHeater;
                water.mainwater();
            }else{
                System.out.println("in water UltraWaterHeater is not found");
            }
        }else{
            System.out.println("water is null");
        }
    }
}
