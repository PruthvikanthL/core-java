package com.acessspeci.specifier.internal;

public class CurvedShape {
    public CurvedShape(){
        System.out.println("Running Curved Shape no-arg const");
    }
    public void curvedisp(){
        System.out.println("Running curvedisp method and accessing public and defualt package");
        Shell shell=new Shell();
        shell.lightweight();
        shell.hardoutersurface();
    }
}
