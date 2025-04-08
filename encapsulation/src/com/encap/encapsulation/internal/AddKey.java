package com.encap.encapsulation.internal;

public class AddKey {
    public void addkeydisp(){
        KeyChain keyChain=new KeyChain();
        System.out.println("The key count is"+keyChain.getKeycout());
        System.out.println("The material is"+keyChain.getMaterial());
        System.out.println("The hastorch is"+keyChain.gethastorch());
        System.out.println("The brand name is"+keyChain.getBrandname());
        System.out.println("The has key Tracker is"+keyChain.gethaskeyTracker());
        keyChain.setkeycout(200);
        keyChain.setmaterial("Brass");
        keyChain.sethastorch(false);
        keyChain.setbrandname("Asia");
        keyChain.setHaskeyTracker(false);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("The updated key count is"+keyChain.getKeycout());
        System.out.println("The updated material is"+keyChain.getMaterial());
        System.out.println("The updated hastorch is"+keyChain.gethastorch());
        System.out.println("The updated brand name is"+keyChain.getBrandname());
        System.out.println("The updated has key Tracker is"+keyChain.gethaskeyTracker());

    }
}
