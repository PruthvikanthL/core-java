package com.inheritance.overriding.internal;

public class ProSmartSocket extends SmartSocket{
    public ProSmartSocket(){
        System.out.println("Runninng the ProSmartSocket const");
    }
    public void showsock(SmartSocket smartSocket){
        if(smartSocket!=null){
            smartSocket.usesmart();
            if(smartSocket instanceof MaxSmartSocket){
                MaxSmartSocket smart=(MaxSmartSocket) smartSocket;
                smart.mainsmart();
            }
            System.out.println("in smartsocket MaxSmartSocket is  not found");
        }else{
            System.out.println("smartsocket is null");
        }
    }
}
