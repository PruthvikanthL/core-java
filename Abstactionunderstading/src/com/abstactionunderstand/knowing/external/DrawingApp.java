package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.Shape;

public class DrawingApp {
    Shape shape;
    public DrawingApp(Shape shape){
        this.shape=shape;

    }
    public void drawingtool(){
        System.out.println("Running the Drawingtool method");
        if(this.shape!=null){
          this.shape.showshape();
        }
        else{
            System.err.println("sorry shape is null we cant access any tool");
        }
    }
}
