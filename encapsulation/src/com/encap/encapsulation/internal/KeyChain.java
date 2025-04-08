package com.encap.encapsulation.internal;

public class KeyChain {
    private int keycout=112;
    private String material="iron";
    private boolean hastorch=true;
    private String brandname="godrej";
    private boolean haskeyTracker=true;
    void setkeycout(int keycout){
        this.keycout=keycout;
    }
    void setmaterial(String material){
        this.material=material;
    }
    void sethastorch(boolean hastorch){
        this.hastorch=hastorch;
    }
    void setbrandname(String brandname){
        this.brandname=brandname;
    }
    void setHaskeyTracker(boolean haskeyTracker){
        this.haskeyTracker=haskeyTracker;
    }

    public int getKeycout() {
        return this.keycout;
    }
    public String getMaterial(){
        return this.material;
    }
    public boolean gethastorch(){
        return this.hastorch;
    }
    public String getBrandname(){
        return this.brandname;
    }
    public boolean gethaskeyTracker(){
        return this.haskeyTracker;
    }
}
