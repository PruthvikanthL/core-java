package com.encap.encapsulation.external;

import com.encap.encapsulation.internal.Occupation;

public class OccupationManager {
    public void manageOccupation() {
        Occupation occupation = new Occupation();
        System.out.println("\n");
        System.out.println("Accessing from external package");
        System.out.println("Job Title is"+occupation.getJobTitle());
        System.out.println("Industry is "+occupation.getIndustry());
        System.out.println("Years of Experience is"+occupation.getExperienceYears());
        System.out.println("Is Remote is"+occupation.getIsRemote());
        System.out.println("Salary is"+occupation.getSalary());
    }
}
