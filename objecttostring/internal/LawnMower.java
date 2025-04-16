package com.inheritance.overriding.internal;

public class LawnMower {
    private    int bladeLength;
    private   String type;

    public LawnMower(int bladeLength, String type) {
        System.out.println("Running the LawnMower const");
        this.bladeLength = bladeLength;
        this.type = type;
    }

    @Override
    public String toString() {
        return bladeLength + " " + type;
    }

    public void lawndisp() {
        System.out.println("Blade Length: " + this.bladeLength + ", Type: " + this.type);
    }

//    public void uselawnmower() {
//        System.out.println("Running the LawnMower in the parent class");
//    }
}
