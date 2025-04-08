package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Badge;

public class BadgeManager {
    public void managdisp(){
        Badge badge=new Badge();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Brand name is"+badge.getName());
        System.out.println("Brand type is"+badge.getType());
        System.out.println("Brand idnumber is"+badge.getIdNumber());
        System.out.println("Brand color is"+badge.getColor());
        System.out.println("Brand is active "+badge.getisActive());
    }
}
