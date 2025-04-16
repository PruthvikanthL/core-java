//package com.inheritance.overriding.internal;
//
//public class ProWaterPurifier extends WaterPurifier{
//    public ProWaterPurifier(){
//        System.out.println("Running the ProWaterPurifier const");
//    }
//    public void showwater(WaterPurifier waterPurifier){
//        if(waterPurifier!=null){
//            waterPurifier.usepurifier();
//            if(waterPurifier instanceof MaxWaterPurifier){
//                MaxWaterPurifier water=(MaxWaterPurifier) waterPurifier;
//                water.mainpurifier();
//            }
//            else{
//                System.out.println("in waterpurifier MaxWaterPurifier is not found");
//            }
//        }else{
//            System.out.println("waterpurifier is null");
//        }
//    }
//}
