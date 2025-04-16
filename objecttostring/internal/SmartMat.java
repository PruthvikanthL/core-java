package com.inheritance.overriding.internal;

public class SmartMat {
    private String matType;
    private String material;

    public SmartMat() {
        System.out.println("Running the SmartMat const");
    }

    public void setSmartMat(String matType, String material) {
        this.matType = matType;
        this.material = material;
    }

    public String toString() {
        return matType + " " + material;
    }

    public void matDisp() {
        System.out.println("Mat Type is " + this.matType + " Material is " + this.material);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartMat class");
//    }
}
