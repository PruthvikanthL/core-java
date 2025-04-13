package com.inheritance.overriding.internal;

public class ProSmartMirror extends SmartMirror{
    public ProSmartMirror(){
        System.out.println("Running the proSmartMirror const");
    }
    public void showmirror(SmartMirror smartMirror){
        if(smartMirror!=null){
            smartMirror.usemirror();
            if(smartMirror instanceof UltraSmartMirror){
                UltraSmartMirror mirror=new UltraSmartMirror();
                mirror.mainmirror();
            }
            else{
                System.out.println("in Smartmirror ultrasmartmirror is not found");
            }
        }else{
            System.out.println("Smartmirror is null");
        }
    }
}
