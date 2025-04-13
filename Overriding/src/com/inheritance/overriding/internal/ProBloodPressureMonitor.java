package com.inheritance.overriding.internal;

public class ProBloodPressureMonitor extends BloodPressureMonitor{
    public ProBloodPressureMonitor(){
        System.out.println("Running the ProBloodPressureMonitor const");
    }
    public void showblood(BloodPressureMonitor bloodPressureMonitor){
        if(bloodPressureMonitor!=null){
            bloodPressureMonitor.useblood();
            if(bloodPressureMonitor instanceof SmartBloodPressureMonitor){
                SmartBloodPressureMonitor smart=(SmartBloodPressureMonitor) bloodPressureMonitor;
                smart.mainblood();
            }
            else{
                System.out.println("in bloodpressuremonitor SmartBloodPressureMonitor is not found");
            }
        }else {
            System.out.println("bloodpressuremonitor is null");
        }
    }
}
