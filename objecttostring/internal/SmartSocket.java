package com.inheritance.overriding.internal;

public class SmartSocket {
    private String socketType;
    private int voltage;

    public SmartSocket() {
        System.out.println("Running the SmartSocket const");
    }

    public void setSmartSocket(String socketType, int voltage) {
        this.socketType = socketType;
        this.voltage = voltage;
    }

    public String toString() {
        return socketType + " " + voltage;
    }

    public void socketDisp() {
        System.out.println("Socket Type is " + this.socketType + " Voltage is " + this.voltage);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartSocket class");
//    }
}
