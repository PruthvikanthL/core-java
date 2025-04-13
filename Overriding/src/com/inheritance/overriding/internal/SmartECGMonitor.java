package com.inheritance.overriding.internal;

public class SmartECGMonitor extends ECGMonitor{
    public SmartECGMonitor(){
        System.out.println("Runninng the SmartECGMonitor const");
    }
    public void showmoni(ECGMonitor ecgMonitor){
        ecgMonitor.useecg();
        if(ecgMonitor!=null){
            if(ecgMonitor instanceof ProECGMonitor){
                ProECGMonitor pro=(ProECGMonitor) ecgMonitor;
                pro.mainecg();
            }
            else{
                System.out.println("in ECGmonitor ProECGMonitor is not found");
            }
        }else{
            System.out.println("ECGmonitor in null");
        }
    }
}
