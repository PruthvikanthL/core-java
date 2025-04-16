package com.inheritance.overriding.internal;

public class SmartLock {
    private String brand;
    private boolean isFingerprintEnabled;

    public SmartLock(String brand, boolean isFingerprintEnabled) {
        System.out.println("Running the SmartLock const");
        this.brand = brand;
        this.isFingerprintEnabled = isFingerprintEnabled;
    }

    @Override
    public String toString() {
        return brand + " - Fingerprint Enabled: " + isFingerprintEnabled;
    }

    public void lockDisp() {
        System.out.println("Brand: " + this.brand + ", Fingerprint Enabled: " + this.isFingerprintEnabled);
    }

    // Uncomment if needed
    // public void uselock() {
    //     System.out.println("Running the uselock method in parent class");
    // }
}
