package com.inheritance.overriding.internal;

public class ProRouter extends Router{
    public ProRouter(){
        System.out.println("ProRouter const is running");
    }
    public void routershow(Router router){
        if(router!=null){
            router.userouter();
            if(router instanceof MaxRouter){
                MaxRouter max=(MaxRouter) router;
                max.mainrouter();
            }
            else{
                System.out.println("in router MaxRouter is not found");
            }
        }else{
            System.out.println("router is null");
        }
    }
}
