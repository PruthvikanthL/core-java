package com.inheritance.overriding.internal;

public class ProBlender extends Blender{
    public ProBlender(){
        System.out.println("Running ProBlender const");
    }
    public void showblender(Blender blender){
        if(blender!=null){
            blender.useblender();
            if(blender instanceof UltraBlender){
                UltraBlender blend=(UltraBlender) blender;
                blend.mainbleder();
            }
            else {
                System.out.println("in blender UltraBlender  not found");
            }
        }else{
            System.out.println("blender is null");
        }
    }
}
