package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.KeyChain;

public class FlashTorch {
    public void flashdisp(){
        KeyChain keyChain=new KeyChain();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Read accessbility from external package");
        System.out.println("The key count is"+keyChain.getKeycout());
        System.out.println("The material is"+keyChain.getMaterial());
        System.out.println("The hastorch is"+keyChain.gethastorch());
        System.out.println("The brand name is"+keyChain.getBrandname());
        System.out.println("The has key Tracker is"+keyChain.gethaskeyTracker());
    }
}
