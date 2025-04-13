package com.inheritance.overriding.internal;

public class ProOven extends Oven{
    public ProOven(){
        System.out.println("Running the proOven const");
    }
    public void showoven(Oven oven){
        if(oven!=null){
            oven.useoven();
            if(oven instanceof MaxOven){
                MaxOven oven1=(MaxOven) oven;
                oven1.mainoven();
            }
            else{
                System.out.println("in oven max oven not found");
            }
        }else{
            System.out.println("oven is null");
        }
    }
}
