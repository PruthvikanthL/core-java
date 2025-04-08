package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Garage;

public class GarageManager {
    public void manageDisp(){
        Garage garage = new Garage();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Garage Name is "+garage.getName());
        System.out.println("Garage Capacity is "+garage.getCapacity());
        System.out.println("Garage Location is "+garage.getLocation());
        System.out.println("Has Security: "+garage.getHasSecurity());
        System.out.println("Open Hours: "+garage.getOpenHours());
    }
}
