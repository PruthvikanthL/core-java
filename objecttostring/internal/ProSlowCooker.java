//package com.inheritance.overriding.internal;
//
//public class ProSlowCooker extends SlowCooker{
//    public ProSlowCooker(){
//        System.out.println("Running the ProSlowCooker const");
//    }
//    public void showslow(SlowCooker slowCooker){
//        if(slowCooker!=null){
//            slowCooker.usecook();
//            if(slowCooker instanceof UltraSlowCooker){
//                UltraSlowCooker slow=(UltraSlowCooker) slowCooker;
//                slow.maincook();
//            }
//            else{
//                System.out.println("in slowcooker ultraslowcooker is not found");
//            }
//        }else{
//            System.out.println("slowcooker is null");
//        }
//    }
//}
