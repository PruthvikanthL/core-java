package com.inheritance.overriding.internal;

public class ProDashCam extends DashCam{
    public ProDashCam(){
        System.out.println("Ruunning the ProDashCam const");
    }
    public void showdash(DashCam dashCam){
        if(dashCam!=null){
            dashCam.usedash();
            if(dashCam instanceof UltraDashCam){
                UltraDashCam dash=(UltraDashCam) dashCam;
                dash.maindash();
            }
            else{
                System.out.println("in dashcam is not having the UltraDashCam");
            }
        }else{
            System.out.println("dashcam is null");
        }
    }
}
