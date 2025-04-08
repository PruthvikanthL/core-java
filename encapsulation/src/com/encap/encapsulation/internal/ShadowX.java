package com.encap.encapsulation.internal;

public class ShadowX {
    public void shadowdis(){
        Mutant mutant=new Mutant();
        System.out.println("Mutant name is"+mutant.getMutantname());
        System.out.println("Mutant loc is"+mutant.getMutantloc());
        System.out.println("Mutant cap is"+mutant.getMutantcap());
        System.out.println("Mutant weight is"+mutant.getMutantwieght());
        System.out.println("Mutant height is"+mutant.getMutantheight());
        mutant.setMutantname("Amurth");
        mutant.setMutantloc("chitradurga");
        mutant.setMutantcap(44);
        mutant.setMutantheight(8);
        mutant.setMutantwieght(90);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Mutant updated name is"+mutant.getMutantname());
        System.out.println("Mutant updated loc is"+mutant.getMutantloc());
        System.out.println("Mutant updated cap is"+mutant.getMutantcap());
        System.out.println("Mutant updated weight is"+mutant.getMutantwieght());
        System.out.println("Mutant updated height is"+mutant.getMutantheight());

    }
}
