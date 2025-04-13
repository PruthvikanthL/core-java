package com.inheritance.overriding.internal;

public class ProElectricBlanket extends ElectricBlanket{
    public ProElectricBlanket(){
        System.out.println("Running the ProElectricBlanket const");
    }
    public void showblank(ElectricBlanket electricBlanket){
        if(electricBlanket!=null){
            electricBlanket.useele();
            if(electricBlanket instanceof UltraElectricBlanket){
                UltraElectricBlanket blank=(UltraElectricBlanket) electricBlanket;
                blank.mainele();
            }else{
                System.out.println("in electricblanket UltraElectricBlanket is not found");
            }}
            else{
                System.out.println("electicblanket is null");
            }

    }
}
