package com.inheritance.overriding.internal;

public class SmartSprinkler {
    private String sprinklerType;
    private int waterFlowRate;

    public SmartSprinkler() {
        System.out.println("Running the SmartSprinkler const");
    }

    public void setSmartSprinkler(String sprinklerType, int waterFlowRate) {
        this.sprinklerType = sprinklerType;
        this.waterFlowRate = waterFlowRate;
    }

    public String toString() {
        return sprinklerType + " " + waterFlowRate;
    }

    public void sprinklerDisp() {
        System.out.println("Sprinkler Type is " + this.sprinklerType + " Water Flow Rate is " + this.waterFlowRate);
    }

//    public void usesmart() {
//        System.out.println("Running the usesmart method in the SmartSprinkler class");
//    }
}
