//package com.inheritance.overriding.internal;
//
//public class ProMonitor extends Monitor{
//    public ProMonitor(){
//        System.out.println("Running the ProMonitor const");
//    }
//    public void showmonitor(Monitor monitor){
//        if(monitor!=null){
//            monitor.usemonitor();
//            if(monitor instanceof UltraMonitor){
//                UltraMonitor moni=(UltraMonitor) monitor;
//                moni.mainmonitor();
//            }
//            else{
//                System.out.println("in monitor UltraMonitor is not found");
//            }
//        }else{
//            System.out.println("mointor is null");
//        }
//    }
//}
