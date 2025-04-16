package com.inheritance.overriding.internal;

public class SmartHelmet {
    private String helmetType;
    private String material;

    public SmartHelmet() {
        System.out.println("Running the SmartHelmet const");
    }

    public void setSmartHelmet(String helmetType, String material) {
        this.helmetType = helmetType;
        this.material = material;
    }

    public String toString() {
        return helmetType + " " + material;
    }

    public void helmetDisp() {
        System.out.println("Helmet Type is " + this.helmetType + " Material is " + this.material);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartHelmet class");
//    }
}
