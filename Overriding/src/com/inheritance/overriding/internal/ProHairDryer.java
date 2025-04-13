package com.inheritance.overriding.internal;

public class ProHairDryer extends HairDryer{
    public ProHairDryer(){
        System.out.println("Runniing the ProHairDryer const");
    }
    public void showdriver(HairDryer hairDryer){
        if(hairDryer!=null){
            hairDryer.usehairdryer();
            if(hairDryer instanceof MaxHairDryer){
                MaxHairDryer dryer=(MaxHairDryer) hairDryer;
                dryer.mainhairdryer();
            }
            else{
                System.out.println("in hairdryer maxharidryer is not found");
            }
        }else{
            System.out.println("Hairdryer is null");
        }
    }
}
