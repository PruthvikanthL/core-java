package com.encap.encapsulation.internal;

public class ApartmentTester {
    public void apartmentDisp() {
        Apartment apartment = new Apartment();
        System.out.println("ApartmentNameis"+apartment.getName());
        System.out.println("ApartmentLocationis"+apartment.getLocation());
        System.out.println("NumberOfFlatsis"+apartment.getNumberOfFlats());
        System.out.println("HasLiftis"+apartment.getHasLift());
        System.out.println("OwnerNameis"+apartment.getOwnerName());
        apartment.setName("PruthviTowers");
        apartment.setLocation("BasaveshwaraNagar");
        apartment.setNumberOfFlats(80);
        apartment.setHasLift(false);
        apartment.setOwnerName("Pruthvi");
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("UpdatedApartmentName is"+apartment.getName());
        System.out.println("UpdatedApartmentLocation is"+apartment.getLocation());
        System.out.println("UpdatedNumberOfFlats is"+apartment.getNumberOfFlats());
        System.out.println("UpdatedHasLift is"+apartment.getHasLift());
        System.out.println("UpdatedOwnerName is"+apartment.getOwnerName());
    }
}
