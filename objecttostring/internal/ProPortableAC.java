//package com.inheritance.overriding.internal;
//
//public class ProPortableAC extends PortableAC{
//    public ProPortableAC(){
//        System.out.println("Running the ProPortableAC const");
//    }
//    public void showport(PortableAC portableAC){
//        if(portableAC!=null){
//            portableAC.useportable();
//            if(portableAC instanceof SmartPortableAC){
//                SmartPortableAC port=(SmartPortableAC) portableAC;
//                port.mainportable();
//            }
//            else{
//                System.out.println("portable ac SmartPortableAC  is not found");
//            }
//        }else {
//            System.out.println("portable ac is null");
//        }
//    }
//}
