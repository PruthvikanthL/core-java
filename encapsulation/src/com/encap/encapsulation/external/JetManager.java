package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Jet;

public class JetManager {
    public void manageJet() {
        Jet jet = new Jet();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Jet Model is"+jet.getModel());
        System.out.println("Jet Speed is"+jet.getSpeed());
        System.out.println("Fuel Capacity is"+jet.getFuelCapacity());
        System.out.println("Jet Color is"+jet.getColor());
        System.out.println("Is Military Jet is"+jet.getIsMilitary());
    }
}
