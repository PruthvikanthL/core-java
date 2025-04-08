package com.encap.encapsulation.internal;

public class PostOfficeTester {
    public void postDisp() {
        PostOffice postOffice = new PostOffice();
        System.out.println("Post Office Name is "+postOffice.getName());
        System.out.println("Location is"+postOffice.getLocation());
        System.out.println("PIN Code is "+postOffice.getPinCode());
        System.out.println("Is Open is"+postOffice.getIsOpen());
        System.out.println("Staff Count is"+postOffice.getStaffCount());
        postOffice.setName("SpeedPost Center");
        postOffice.setLocation("Bangalore");
        postOffice.setPinCode(560001);
        postOffice.setIsOpen(false);
        postOffice.setStaffCount(20);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Updated Post Office Name is"+postOffice.getName());
        System.out.println("Updated Location is"+postOffice.getLocation());
        System.out.println("Updated PIN Code is"+postOffice.getPinCode());
        System.out.println("Is Open Now is"+postOffice.getIsOpen());
        System.out.println("Updated Staff Count is"+postOffice.getStaffCount());
    }
}
