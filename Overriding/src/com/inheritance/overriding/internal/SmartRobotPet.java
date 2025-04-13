package com.inheritance.overriding.internal;

public class SmartRobotPet extends RobotPet{
    public SmartRobotPet(){
        System.out.println("Running the smartRobotPet const ");
    }
    public void showrobot(RobotPet robotPet){
        if(robotPet!=null){
            robotPet.userobotpet();
            if(robotPet instanceof ProRobotPet ){
                ProRobotPet pet=(ProRobotPet) robotPet;
                pet.mainrobotpet();
            }else{
                System.out.println("in Robotpet prorobotpet is not found");
            }
        }else {
            System.out.println("Robotpet is null");
        }
    }
}
