package com.encap.encapsulation.internal;

public class PostOffice {
    private String name = "India Post";
    private String location = "Challakere";
    private int pinCode = 577522;
    private boolean isOpen = true;
    private int staffCount = 12;

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getPinCode() {
        return this.pinCode;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }

    public int getStaffCount() {
        return this.staffCount;
    }
}



