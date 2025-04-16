//package com.inheritance.overriding.internal;
//
//public class ProDigitalMicroscope extends DigitalMicroscope{
//    public ProDigitalMicroscope(){
//        System.out.println("Runninng the ProDigitalMicroscope const");
//    }
//    public void showmicro(DigitalMicroscope digitalMicroscope){
//        if(digitalMicroscope!=null){
//            digitalMicroscope.usedigital();
//            if(digitalMicroscope instanceof EliteDigitalMicroscope){
//                EliteDigitalMicroscope elit=(EliteDigitalMicroscope) digitalMicroscope;
//                elit.maindigital();
//            }else{
//                System.out.println("in digitalmicroscope EliteDigitalMicroscope is not found");
//            }
//        }else{
//            System.out.println("digitalmicroscope is  null ");
//        }
//    }
//}
