package com.inheritance.overriding.internal;

public class SmartFaucet {
    private String faucetType;
    private String material;

    public SmartFaucet() {
        System.out.println("Running the SmartFaucet const");
    }

    public void setSmartFaucet(String faucetType, String material) {
        this.faucetType = faucetType;
        this.material = material;
    }

    public String toString() {
        return faucetType + " " + material;
    }

    public void faucetDisp() {
        System.out.println("Faucet Type is " + this.faucetType + " Material is " + this.material);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartFaucet class");
//    }
}
