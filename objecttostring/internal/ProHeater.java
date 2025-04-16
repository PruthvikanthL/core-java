//package com.inheritance.overriding.internal;
//
//public class ProHeater extends Heater{
//    public ProHeater(){
//        System.out.println("Running the ProHeater const");
//    }
//    public void showheat(Heater heater){
//        if(heater!=null){
//            heater.useheater();
//            if(heater instanceof EliteHeater){
//                EliteHeater heat=(EliteHeater) heater;
//                heat.mainheater();
//            }
//            else{
//                System.out.println("in Heater eliteheater is not found");
//            }
//        }else {
//            System.out.println("heater is null");
//        }
//    }
//}
