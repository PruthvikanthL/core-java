package com.inheritance.overriding.internal;

public class ProSmartCurtain extends SmartCurtain{
    public ProSmartCurtain(){
        System.out.println("Runninng the ProSmartCurtain const");
    }
    public void showsmart(SmartCurtain smartCurtain){
        if(smartCurtain!=null){
            smartCurtain.usesmart();
            if(smartCurtain instanceof EliteSmartCurtain){
                EliteSmartCurtain cur=(EliteSmartCurtain) smartCurtain;
                cur.mainsmart();
            }
            else{
                System.out.println("in smartcurtain EliteSmartCurtain is not found");
            }
        }else{
            System.out.println("smartcurtain is null");
        }
    }
}
