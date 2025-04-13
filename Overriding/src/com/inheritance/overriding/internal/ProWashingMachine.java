package com.inheritance.overriding.internal;

public class ProWashingMachine extends WashingMachine{
    public ProWashingMachine(){
        System.out.println("Running the proWashingMachine const");
    }
    public void showwash(WashingMachine washingMachine){
        if(washingMachine!=null){
            washingMachine.usewashmachine();
            if(washingMachine instanceof EliteWashingMachine){
                EliteWashingMachine wash=(EliteWashingMachine) washingMachine;
                wash.usewashmachine();
            }
            else{
                System.out.println("in washingmachine elitewashing machine not found");
            }
        }else{
            System.out.println("washing machine is null");
        }
    }
}
