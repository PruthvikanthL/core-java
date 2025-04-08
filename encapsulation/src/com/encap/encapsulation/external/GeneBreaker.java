package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Mutant;

public class GeneBreaker {

    public void Genedisp(){
        Mutant mutant=new Mutant();
        System.out.println("\n");
        System.out.println("Read accessbility from external package");
        System.out.println("Mutant name is"+mutant.getMutantname());
        System.out.println("Mutant loc is"+mutant.getMutantloc());
        System.out.println("Mutant cap is"+mutant.getMutantcap());
        System.out.println("Mutant weight is"+mutant.getMutantwieght());
        System.out.println("Mutant height is"+mutant.getMutantheight());

    }
}
