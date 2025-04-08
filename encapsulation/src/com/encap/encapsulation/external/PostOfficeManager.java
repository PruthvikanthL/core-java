package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.PostOffice;

public class PostOfficeManager {
    public void manageDisplay() {
        PostOffice postOffice = new PostOffice();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Post Office Name is"+postOffice.getName());
        System.out.println("Location is"+postOffice.getLocation());
        System.out.println("PIN Code is"+postOffice.getPinCode());
        System.out.println("Is Open is"+postOffice.getIsOpen());
        System.out.println("Staff Count is"+postOffice.getStaffCount());
    }
}
