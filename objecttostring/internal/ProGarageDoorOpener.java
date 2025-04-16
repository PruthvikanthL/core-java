//package com.inheritance.overriding.internal;
//
//public class ProGarageDoorOpener extends GarageDoorOpener{
//    public ProGarageDoorOpener(){
//        System.out.println("Running the ProGarageDoorOpener const");
//    }
//    public void showdoor(GarageDoorOpener garageDoorOpener){
//        if(garageDoorOpener!=null){
//            garageDoorOpener.usegarage();
//            if(garageDoorOpener instanceof UltraGarageDoorOpener){
//                UltraGarageDoorOpener door=(UltraGarageDoorOpener) garageDoorOpener;
//                door.maingarage();
//            }
//            else{
//                System.out.println("in garagedooropene ultragaragedooropner not found");
//            }
//        }else{
//            System.out.println("garagadooropener is null");
//        }
//    }
//}
