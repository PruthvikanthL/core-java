package com.encap.encapsulation.internal;

public class Badge {
    private String name = "StarBadge";
    private String type = "Achievement";
    private int idNumber = 101;
    private String color = "Blue";
    private boolean isActive = true;
    void setName(String name){
        this.name=name;
    }
    void setType(String type){
        this.type=type;
    }
    void setIdNumber(int idNumber){
        this.idNumber=idNumber;
    }
    void setColor(String color){
        this.color=color;
    }
    void setActive(boolean isActive){
        this.isActive=isActive;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getIdNumber(){
        return this.idNumber;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getisActive(){
        return this.isActive;
    }
}
