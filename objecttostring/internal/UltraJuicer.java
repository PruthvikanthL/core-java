//package com.inheritance.overriding.internal;
//
//public class UltraJuicer extends Juicer{
//    public UltraJuicer(){
//        System.out.println("Running the UltraJuicer const");
//    }
//    public void showjuice(Juicer juicer){
//        if(juicer!=null){
//            juicer.usejuice();
//            if(juicer instanceof ProJuicer){
//                ProJuicer juice=(ProJuicer) juicer;
//                juice.mainjuice();
//            }
//            else{
//                System.out.println("in juice ProJuicer is not found");
//            }
//        }else{
//            System.out.println("juice is null");
//        }
//    }
//}
