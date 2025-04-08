package com.encap.encapsulation.internal;

public class BadgeTester {
    public void badgedisp(){
        Badge badge=new Badge();
        System.out.println("Brand name is"+badge.getName());
        System.out.println("Brand type is"+badge.getType());
        System.out.println("Brand idnumber is"+badge.getIdNumber());
        System.out.println("Brand color is"+badge.getColor());
        System.out.println("Brand is active "+badge.getisActive());
        badge.setName("galaxybadge");
        badge.setType("Achivement");
        badge.setIdNumber(202);
        badge.setColor("Green");
        badge.setActive(false);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Brand name is"+badge.getName());
        System.out.println("Brand type is"+badge.getType());
        System.out.println("Brand idnumber is"+badge.getIdNumber());
        System.out.println("Brand color is"+badge.getColor());
        System.out.println("Brand is active "+badge.getisActive());
    }
}
