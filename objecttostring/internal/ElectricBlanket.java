package com.inheritance.overriding.internal;

public class ElectricBlanket {
    private int heatLevel;
    private String fabricType;

    public ElectricBlanket() {
        System.out.println("Running the ElectricBlanket const");
    }

    public void setElectricBlanket(int heatLevel, String fabricType) {
        this.heatLevel = heatLevel;
        this.fabricType = fabricType;
    }

    public String toString() {
        return heatLevel + " " + fabricType;
    }

    public void blanketDisp() {
        System.out.println("Heat Level is " + this.heatLevel + " Fabric Type is " + this.fabricType);
    }

//    public void useele() {
//        System.out.println("Running the useele method in the ElectricBlanket class");
//    }
}
