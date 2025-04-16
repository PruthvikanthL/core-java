//package com.inheritance.overriding.internal;
//
//public class ProTablet extends Tablet{
//    public ProTablet(){
//        System.out.println("Running the ProTablet const");
//    }
//    public void tabshow(Tablet tablet){
//        if(tablet!=null){
//            tablet.usetablet();
//            if(tablet instanceof SmartTablet){
//                SmartTablet smart=(SmartTablet) tablet;
//                smart.maintablet();
//            }
//            else{
//                System.out.println("in tablet smart tablet not found");
//            }
//        }else{
//            System.out.println("Tablet is null");
//        }
//    }
//}
