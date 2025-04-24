package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.Vehicle;

public class TransportSystem {
    Vehicle vehicle;
    public TransportSystem(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void searchvehicle(){
        System.out.println("Running the searchvehicle method in the TransportSystem");
        if(vehicle!=null){
            vehicle.Regnumber();
        }
        else{
            System.out.println("sorry vehicle is null");
        }
    }
}
