package com.encap.encapsulation.internal;

import com.encap.encapsulation.external.*;

public class Runner {
    public static void main(String[] args) {
        //for mutant
        ShadowX shadowX=new ShadowX();
        shadowX.shadowdis();
        GeneBreaker geneBreaker=new GeneBreaker();
        geneBreaker.Genedisp();
        System.out.println("==========================================================");
        //for key
        AddKey addKey=new AddKey();
        addKey.addkeydisp();
        FlashTorch flashTorch=new FlashTorch();
        flashTorch.flashdisp();
        System.out.println("==========================================================");
        //for tank
        Water water=new Water();
        water.waterdisp();
        Fuel fuel=new Fuel();
        fuel.fueldisp();
        System.out.println("==========================================================");
        //for badge
        BadgeTester badgeTester=new BadgeTester();
        badgeTester.badgedisp();
        BadgeManager badgeManager=new BadgeManager();
        badgeManager.managdisp();
        System.out.println("==========================================================");
        //for postoffice
        PostOfficeTester postOfficeTester=new PostOfficeTester();
        postOfficeTester.postDisp();
        PostOfficeManager postOfficeManager=new PostOfficeManager();
        postOfficeManager.manageDisplay();
        System.out.println("==========================================================");
        // for occupation
        OccupationTester occupationTester=new OccupationTester();
        occupationTester.occuDisp();
        OccupationManager occupationManager=new OccupationManager();
        occupationManager.manageOccupation();
        System.out.println("==========================================================");
        //for jet
        JetTester jetTester=new JetTester();
        jetTester.jetDisp();
        JetManager jetManager=new JetManager();
        jetManager.manageJet();
        System.out.println("==========================================================");
        GarageTester garageTester=new GarageTester();
        garageTester.garageDisp();
        GarageManager garageManager=new GarageManager();
        garageManager.manageDisp();
        System.out.println("==========================================================");
        //for gym
        GymTester gymTester=new GymTester();
        gymTester.gymDisp();
        GymManager gymManager=new GymManager();
        gymManager.manageDisp();
        System.out.println("==========================================================");
    }
}
