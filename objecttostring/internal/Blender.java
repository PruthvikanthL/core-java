package com.inheritance.overriding.internal;

public class Blender {
    int size;
    String softname;
    public Blender(int size,String softname){
        System.out.println("Running the Blender const");
        this.size=size;
        this.softname=softname;
    }
    public String toString(){
        return size+softname;
    }
    public void blenddisp(){
        System.out.println("Size"+this.size+"software name"+this.softname);

    }
//    public void useblender(){
//        System.out.println("Ruuning the useblender method in the parent class");
//    }
}
