package com.encap.encapsulation.internal;

public class Tank {
    private String name="abx123";
    private int size=12;
    private boolean filled=true;
    private String color="orange";
    private int level=45;
    void setName(String name){
        this.name=name;
    }
    void setSize(int size){
        this.size=size;
    }
    void setfilled(boolean filled){
        this.filled=filled;
    }
    void setColor(String color){
        this.color=color;
    }
    void setLevel(int level){
        this.level=level;
    }
    public String getName(){
        return this.name;
    }
    public int getSize(){
        return this.size;
    }
    public boolean getfilled(){
        return this.filled;
    }
    public String getColor(){
        return this.color;
    }
    public int getLevel(){
        return this.level;
    }
}
