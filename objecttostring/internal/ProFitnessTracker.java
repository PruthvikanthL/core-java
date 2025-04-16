//package com.inheritance.overriding.internal;
//
//public class ProFitnessTracker extends FitnessTracker{
//    public ProFitnessTracker(){
//        System.out.println("Running the ProFitnessTracker const");
//    }
//    public void showfit(FitnessTracker fitnessTracker){
//        if(fitnessTracker!=null){
//            fitnessTracker.usetracker();
//            if(fitnessTracker instanceof MaxFitnessTracker){
//                MaxFitnessTracker fit=(MaxFitnessTracker) fitnessTracker;
//                fit.maintracker();
//            }
//            else{
//                System.out.println("in Fitness MaxFitnessTracker not found");
//            }
//        }else{
//            System.out.println("fitness is  null");
//        }
//    }
//}
