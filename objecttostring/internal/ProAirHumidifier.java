//package com.inheritance.overriding.internal;
//
//public class ProAirHumidifier extends AirHumidifier{
//    public ProAirHumidifier(){
//        System.out.println("Runninng the ProAirHumidifier const");
//    }
//    public void showair(AirHumidifier airHumidifier){
//        if(airHumidifier!=null){
//            airHumidifier.useair();
//            if(airHumidifier instanceof MaxAirHumidifier){
//                MaxAirHumidifier air=(MaxAirHumidifier) airHumidifier;
//                air.useair();
//            }
//            else{
//                System.out.println("in airhumidifier maxhumidifier is not found");
//            }
//        }else{
//            System.out.println("airhumidifier is null");
//        }
//    }
//}
