package com.inheritance.overriding.internal;

public class ProElectricScooter extends ElectricScooter{
    public ProElectricScooter(){
        System.out.println("Running the ProElectricScooter const");
    }
    public void showele(ElectricScooter electricScooter){
        if(electricScooter!=null){
            electricScooter.usescooter();
            if(electricScooter instanceof MaxElectricScooter){
                MaxElectricScooter ele=(MaxElectricScooter) electricScooter;
                ele.mainscooter();
            }
            else{
                System.out.println("in electricscooter is not having maxelectricscooter");
            }
        }else{
            System.out.println("electriscooter is null");
        }
    }
}
