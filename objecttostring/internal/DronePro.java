package com.inheritance.overriding.internal;

public class DronePro {
    private String model;
    private String cameraResolution;

    public DronePro() {
        System.out.println("Running the DronePro const");
    }

    public void setDronePro(String model, String cameraResolution) {
        this.model = model;
        this.cameraResolution = cameraResolution;
    }

    public String toString() {
        return model + " " + cameraResolution;
    }

    public void droneDisp() {
        System.out.println("Model is " + this.model + " Camera Resolution is " + this.cameraResolution);
    }

//    public void usedrone() {
//        System.out.println("Running the usedrone method in the DronePro class");
//    }
}
