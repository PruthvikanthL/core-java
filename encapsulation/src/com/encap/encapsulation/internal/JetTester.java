package com.encap.encapsulation.internal;

public class JetTester {
    public void jetDisp() {
        Jet jet = new Jet();
        System.out.println("Jet Model is"+jet.getModel());
        System.out.println("Jet Speed is"+jet.getSpeed());
        System.out.println("Fuel Capacity is"+jet.getFuelCapacity());
        System.out.println("Jet Color is"+jet.getColor());
        System.out.println("Is Military Jet is"+jet.getIsMilitary());
        jet.setModel("Pruthvirider");
        jet.setSpeed(1200);
        jet.setFuelCapacity(3000);
        jet.setColor("Black");
        jet.setIsMilitary(false);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Updated Jet Model is"+jet.getModel());
        System.out.println("Updated Jet Speed is"+jet.getSpeed());
        System.out.println("Updated Fuel Capacity is"+jet.getFuelCapacity());
        System.out.println("Updated Jet Color is"+jet.getColor());
        System.out.println("Is Military Jet Now is"+jet.getIsMilitary());
    }
}
