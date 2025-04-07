package com.acessspeci.specifier.internal;

import com.acessspeci.specifier.external.*;
import jdk.internal.org.objectweb.asm.Handle;

public class Runner {
    public static void main(String[] args) {
        //for temple
        PrasadaCounter prasadaCounter=new PrasadaCounter();
        prasadaCounter.Tempdisp();
        DonationBox donationBox=new DonationBox();
        donationBox.Restingarea();
        System.out.println("=======================================\n");
        //for church
        Prayer_Request_Box prayerRequestBox=new Prayer_Request_Box();
        prayerRequestBox.disp();
        Confession_Booth confessionBooth=new Confession_Booth();
        confessionBooth.churchdisp();
        System.out.println("=======================================\n");
        //for beach
        FoodStalls foodStalls=new FoodStalls();
        foodStalls.fooddisp();
        Umbrella umbrella=new Umbrella();
        umbrella.beachdisp();
        System.out.println("=======================================\n");
        //coin
        MaterialType materialType=new MaterialType();
        materialType.matdisp();
        CoinEdge coinEdge=new CoinEdge();
        coinEdge.coindisp();
        System.out.println("=======================================\n");
        //drone
        RemoteController remoteController=new RemoteController();
        remoteController.remotedisp();
        GPSSystem gpsSystem=new GPSSystem();
        gpsSystem.gpsdisp();
        System.out.println("=======================================\n");
        //comb
        CombSize combSize=new CombSize();
        combSize.combdisp();
        Shape shape=new Shape();
        shape.Shapedisp();
        System.out.println("=======================================\n");
        //Powder
        SkinFreshness skinFreshness=new SkinFreshness();
        skinFreshness.skindisp();
        Ingredients ingredients=new Ingredients();
        ingredients.ingredisp();
        System.out.println("=======================================\n");
        //perfume
        Longevity longevity=new Longevity();
        longevity.longedisp();
        Portability portability=new Portability();
        portability.Portdip();
        System.out.println("=======================================\n");
        //card
        Magnetic magnetic=new Magnetic();
        magnetic.magdisp();
        Brand brand=new Brand();
        brand.branddisp();
        System.out.println("=======================================\n");
        //shell
        CurvedShape curvedShape=new CurvedShape();
        curvedShape.curvedisp();
        OceanOrigin oceanOrigin=new OceanOrigin();
        oceanOrigin.oceandisp();
        System.out.println("=======================================\n");
        //forest
        Wildlife wildlife=new Wildlife();
        wildlife.wilddisp();
        Sunlight sunlight=new Sunlight();
        sunlight.sundisp();
        System.out.println("=======================================\n");
    }
}
