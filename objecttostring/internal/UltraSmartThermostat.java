//package com.inheritance.overriding.internal;
//
//public class UltraSmartThermostat extends SmartThermostat{
//    public UltraSmartThermostat(){
//        System.out.println("Running the ultraSmartThermostat const");
//    }
//    public void showthermo(SmartThermostat smartThermostat){
//        if(smartThermostat!=null){
//            smartThermostat.usesmart();
//            if(smartThermostat instanceof ProSmartThermostat){
//                ProSmartThermostat smart=(ProSmartThermostat) smartThermostat;
//                smart.mainsmart();
//            }else{
//                System.out.println("in smartthermostat prosmartthermostat is not found");
//            }
//        }else{
//            System.out.println("smarthermostat is null");
//        }
//    }
//}
