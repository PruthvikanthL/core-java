package com.inheritance.overriding.internal;

public class ProBabyMonitor extends BabyMonitor{
    public ProBabyMonitor(){
        System.out.println("Runninng the ProBabyMonitor const");
    }
    public void showmoni(BabyMonitor babyMonitor){
        if(babyMonitor!=null){
            babyMonitor.usebaby();
            if(babyMonitor instanceof EliteBabyMonitor){
                EliteBabyMonitor baby=(EliteBabyMonitor) babyMonitor;
                baby.mainbaby();
            }
            else{
                System.out.println("in Babymonitor elitebabymonitor is not found");
            }
        }else{
            System.out.println("babymonitor is null");
        }
    }
}
