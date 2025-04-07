package com.acessspeci.specifier.external;

import com.acessspeci.specifier.internal.Church;

public class Confession_Booth {
    public Confession_Booth(){
        System.out.println("Running Confession_Booth const");
    }
    public void churchdisp(){
        System.out.println("Running Churchdisp class calling public method");
        Church church=new Church();
        church.Entrance_Sign_Board();
    }
}
