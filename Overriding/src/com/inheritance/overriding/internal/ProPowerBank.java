package com.inheritance.overriding.internal;

public class ProPowerBank extends PowerBank{
    public ProPowerBank(){
        System.out.println("Running the ProPowerBank const");
    }
    public void showbank(PowerBank powerBank){
        if(powerBank!=null){
            powerBank.usepowerbank();
            if(powerBank instanceof UltraPowerBank){
                UltraPowerBank power=(UltraPowerBank) powerBank;
                power.mainusepowerbank();
            }else{
                System.out.println("in powerbank UltraPowerBank  not found");
            }
        }else{
            System.out.println("powerbank is null");
        }
    }
}
