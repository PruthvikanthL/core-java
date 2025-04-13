package com.inheritance.overriding.internal;

public class ProActionCamera extends ActionCamera{
    public ProActionCamera(){
        System.out.println("Running the ProActionCamera const");
    }
    public void showcam(ActionCamera actionCamera){
        if(actionCamera!=null){
            actionCamera.useaction();
            if(actionCamera instanceof MaxActionCamera){
                MaxActionCamera max=(MaxActionCamera) actionCamera;
                max.mainaction();
            }
            else {
                System.out.println("in Action camera MaxActionCamera is not found");
            }
        }else{
            System.out.println("action camera is null");
        }
    }
}
