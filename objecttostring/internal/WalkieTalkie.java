package com.inheritance.overriding.internal;

public class WalkieTalkie {
    private int range;
    private String color;

    public WalkieTalkie() {
        System.out.println("Running the WalkieTalkie const");
    }

    public void setWalkieTalkie(int range, String color) {
        this.range = range;
        this.color = color;
    }

    public String toString() {
        return range + " " + color;
    }

    public void walkDisp() {
        System.out.println("Range is " + this.range + " Color is " + this.color);
    }

//    public void usewalk() {
//        System.out.println("Running the usewalk method in the WalkieTalkie class");
//    }
}
