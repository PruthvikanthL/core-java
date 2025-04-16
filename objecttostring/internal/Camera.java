package com.inheritance.overriding.internal;

public class Camera {
    int number;
    String camname;

    public Camera(int number,String camname){
        System.out.println("no-arg Camera cosnt is running");
        this.number=number;
        this.camname=camname;
    }
    public String toString(){
        return "number"+number+"camname"+camname;
    }
    public void camdisp(){
        System.out.println("number"+this.number+"name"+this.camname);
    }
//    public void usecamera(){
//        System.out.println("no-arg usecamera method is running in the parent class camera");
//    }
}
