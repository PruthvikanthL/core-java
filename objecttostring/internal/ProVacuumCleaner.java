//package com.inheritance.overriding.internal;
//
//public class ProVacuumCleaner extends VacuumCleaner{
//    public ProVacuumCleaner(){
//        System.out.println("Running the ProVacuumCleaner const");
//    }
//    public void vacuumshow(VacuumCleaner vacuumCleaner){
//        if(vacuumCleaner!=null){
//            vacuumCleaner.usevaccum();
//            if(vacuumCleaner instanceof SmartVacuumCleaner){
//                SmartVacuumCleaner smart=(SmartVacuumCleaner) vacuumCleaner;
//                smart.mainvaccumn();
//            }
//            else{
//                System.out.println("in vaccumclaener smartvaccum claener not found");
//            }
//        }else{
//            System.out.println("vaccum cleaner is null");
//        }
//    }
//}
