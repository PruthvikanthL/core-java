package com.inheritance.overriding.internal;

public class ProAirPurifier extends AirPurifier{
    public ProAirPurifier(){
        System.out.println("Ruuning the ProAirPurifier const");
    }
    public void showair(AirPurifier airPurifier){
        if(airPurifier!=null){
            airPurifier.useair();
            if(airPurifier instanceof UltraAirPurifier){
                UltraAirPurifier air=(UltraAirPurifier) airPurifier;
                air.mainair();
            }
            else {
                System.out.println("in airpurifier UltraAirPurifier is not found");
            }
        }else{
            System.out.println("airpurifier is null");
        }
    }
}
