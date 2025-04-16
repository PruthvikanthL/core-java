package com.inheritance.overriding.internal;

public class ActionCamera {
    private String model;
    private String resolution;

    public ActionCamera() {
        System.out.println("Running the ActionCamera const");
    }

    public void setActionCamera(String model, String resolution) {
        this.model = model;
        this.resolution = resolution;
    }

    public String toString() {
        return model + " " + resolution;
    }

    public void actionDisp() {
        System.out.println("Model is " + this.model + " Resolution is " + this.resolution);
    }

//    public void useaction() {
//        System.out.println("Running the useaction method in the ActionCamera class");
//    }
}
