package com.inheritance.overriding.internal;

public class ProElectricGrill extends ElectricGrill{
    public ProElectricGrill(){
        System.out.println("Running the ProElectricGrill const");
    }
    public void showgrill(ElectricGrill electricGrill){
        if(electricGrill!=null){
            electricGrill.useele();
            if(electricGrill instanceof SmartElectricGrill){
                SmartElectricGrill grill=(SmartElectricGrill) electricGrill;
                grill.mainele();
            }
            else{
                System.out.println("in Electricgrill SmartElectricGrill is not found");
            }
        }else{
            System.out.println("electricgrill is null");
        }

    }
}
