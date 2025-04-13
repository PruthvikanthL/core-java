package com.inheritance.overriding.internal;

public class ProGameConsole extends GameConsole{
    public ProGameConsole(){
        System.out.println("Running the ProGameConsole const");
    }
    public void showgame(GameConsole gameConsole){
        if(gameConsole!=null){
            gameConsole.useconsole();
            if(gameConsole instanceof SmartGameConsole){
                SmartGameConsole game=(SmartGameConsole) gameConsole;
                game.mainconsole();
            }
            else {
                System.out.println("in Gameconsole smartgameconsole is not found");
            }
        }else{
            System.out.println("gameconsole is null");
        }
    }
}
