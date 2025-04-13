package com.inheritance.overriding.internal;

public class ProMassageChair extends MassageChair{
    public ProMassageChair(){
        System.out.println("Running the ProMassageChair const");
    }
    public void showmessage(MassageChair massageChair){
        if(massageChair!=null){
            massageChair.usemass();
            if(massageChair instanceof EliteMassageChair){
                EliteMassageChair mess=(EliteMassageChair) massageChair;
                mess.mainmass();
            }
            else{
                System.out.println("in messagechair elitemassagechiar is not found ");
            }
        }else{
            System.out.println("meassagechair is null");
        }
    }
}
