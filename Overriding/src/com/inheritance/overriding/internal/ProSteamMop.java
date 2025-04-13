package com.inheritance.overriding.internal;

public class ProSteamMop extends SteamMop{
    public ProSteamMop(){
        System.out.println("Running the ProSteamMop const");
    }
    public void showmop(SteamMop steamMop){
        if(steamMop!=null){
            steamMop.usemop();
            if(steamMop instanceof SmartSteamMop){
                SmartSteamMop mop=(SmartSteamMop) steamMop;
                mop.mainmop();
            }
            else{
                System.out.println("in Steammop smartstemmob is not found");
            }
        }else{
            System.out.println("steammob is null");
        }
    }
}
