package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Apartment;

public class ApartmentManager {
    public void manageDisp() {
        Apartment apartment = new Apartment();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("ApartmentName is"+apartment.getName());
        System.out.println("Location is"+apartment.getLocation());
        System.out.println("NumberOfFlats is"+apartment.getNumberOfFlats());
        System.out.println("HasLift is"+apartment.getHasLift());
        System.out.println("OwnerName is"+apartment.getOwnerName());
    }
}
