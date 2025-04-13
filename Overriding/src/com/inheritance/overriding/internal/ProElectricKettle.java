package com.inheritance.overriding.internal;

public class ProElectricKettle extends ElectricKettle{
    public ProElectricKettle(){
        System.out.println("Running the ProElectricKettle const");

    }
    public void showkettle(ElectricKettle electricKettle){
        if(electricKettle!=null){
            electricKettle.usekettle();
            if(electricKettle instanceof SmartElectricKettle){
                SmartElectricKettle kettle=(SmartElectricKettle) electricKettle;
                kettle.mainkettle();
            }
            else{
                System.out.println("in ElectricKettle SmartElectricKettle is not found ");
            }
        }else{
            System.out.println("Electrickettle is null");
        }
    }
}
