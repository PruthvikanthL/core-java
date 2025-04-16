//package com.inheritance.overriding.internal;
//
//public class ProRiceCooker extends RiceCooker{
//    public ProRiceCooker(){
//        System.out.println("Runnning the ProRiceCooker const");
//    }
//    public void showrice(RiceCooker riceCooker){
//        if(riceCooker!=null){
//            riceCooker.userice();
//            if(riceCooker instanceof SmartRiceCooker){
//                SmartRiceCooker rice=(SmartRiceCooker) riceCooker;
//                rice.mainrice();
//            }
//            else{
//                System.out.println("in ricecooker SmartRiceCooker is not found");
//            }
//        }else{
//            System.out.println("ricecooker is null");
//        }
//    }
//}
