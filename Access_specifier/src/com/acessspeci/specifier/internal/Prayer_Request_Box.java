package com.acessspeci.specifier.internal;

public class Prayer_Request_Box {
    public Prayer_Request_Box(){
        System.out.println("Running Prayer_Request_Box const");
    }
    public void disp(){
        System.out.println("Running display method and calling public and default package methods");
        Church church=new Church();
        church.Entrance_Sign_Board();
        church.Holy_Water_Stand();
    }
}
