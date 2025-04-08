package com.encap.encapsulation.internal;

public class GarageTester {
    public void garageDisp(){
        Garage garage=new Garage();
        System.out.println("Garage Name is "+garage.getName());
        System.out.println("Garage Capacity is "+garage.getCapacity());
        System.out.println("Garage Location is "+garage.getLocation());
        System.out.println("Has Security: "+garage.getHasSecurity());
        System.out.println("Open Hours: "+garage.getOpenHours());
        garage.setName("PruthviGarage");
        garage.setCapacity(30);
        garage.setLocation("challakere");
        garage.setHasSecurity(false);
        garage.setOpenHours(10);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Updated Garage Name is "+garage.getName());
        System.out.println("Updated Garage Capacity is "+garage.getCapacity());
        System.out.println("Updated Garage Location is "+garage.getLocation());
        System.out.println("Updated Has Security: "+garage.getHasSecurity());
        System.out.println("Updated Open Hours: "+garage.getOpenHours());
    }
}
