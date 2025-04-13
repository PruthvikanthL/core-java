package com.inheritance.overriding.internal;

public class SmartGlucoseMonitor extends  GlucoseMonitor{
    public SmartGlucoseMonitor(){
        System.out.println("Running the smartGlucoseMonitor class");
    }
    public void showglucose(GlucoseMonitor glucoseMonitor){
        if(glucoseMonitor!=null){
            glucoseMonitor.useglu();
            if(glucoseMonitor instanceof EliteGlucoseMonitor){
                EliteGlucoseMonitor glu=(EliteGlucoseMonitor) glucoseMonitor;
                glu.mainglu();
            }else{
                System.out.println("in Glucosemonitor EliteGlucoseMonitor is not found");
            }
        }else{
            System.out.println("Glucosemonitor is null");
        }
    }
}
