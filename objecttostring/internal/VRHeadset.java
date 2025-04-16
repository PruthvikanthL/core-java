package com.inheritance.overriding.internal;

public class VRHeadset {
    private String headsetType;
    private String brand;

    public VRHeadset() {
        System.out.println("Running the VRHeadset const");
    }

    public void setVRHeadset(String headsetType, String brand) {
        this.headsetType = headsetType;
        this.brand = brand;
    }

    public String toString() {
        return headsetType + " " + brand;
    }

    public void headsetDisp() {
        System.out.println("Headset Type is " + this.headsetType + " Brand is " + this.brand);
    }

//    public void usehead() {
//        System.out.println("Running the usehead method in the VRHeadset class");
//    }
}
