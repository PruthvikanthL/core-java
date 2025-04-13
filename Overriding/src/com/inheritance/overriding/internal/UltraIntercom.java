package com.inheritance.overriding.internal;

public class UltraIntercom extends Intercom{
    public UltraIntercom(){
        System.out.println("Running the UltraIntercom const");
    }
    public void showinter(Intercom intercom){
        if(intercom!=null){
            intercom.useinter();
            if(intercom instanceof ProIntercom){
                ProIntercom inter=(ProIntercom) intercom;
                inter.maininter();
            }else{
                System.out.println("in intercome prointercom is not found");
            }
        }else{
            System.out.println("intercom is null");
        }
    }
}
