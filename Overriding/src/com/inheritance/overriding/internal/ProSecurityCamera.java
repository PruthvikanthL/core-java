package com.inheritance.overriding.internal;

public class ProSecurityCamera extends SecurityCamera{
    public ProSecurityCamera(){
        System.out.println("Running the ProSecurityCamera const");
    }
    public void showcamera(SecurityCamera securityCamera){
        if(securityCamera!=null){
            securityCamera.usesecuritycamere();
            if(securityCamera instanceof UltraSecurityCamera){
                UltraSecurityCamera camera=(UltraSecurityCamera) securityCamera;
                camera.mainsecuritycamera();
            }
            else{
                System.out.println("in security camera ultrasecurity camera not found");
            }
        }else{
            System.out.println("security camera is null");
        }
    }
}
