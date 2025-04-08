package com.encap.encapsulation.internal;

public class OccupationTester {
    public void occuDisp() {
        Occupation occupation = new Occupation();
        System.out.println("Job Title is"+occupation.getJobTitle());
        System.out.println("Industry is"+occupation.getIndustry());
        System.out.println("Years of Experience is"+occupation.getExperienceYears());
        System.out.println("Is Remote is"+occupation.getIsRemote());
        System.out.println("Salary is"+occupation.getSalary());
        occupation.setJobTitle("Data Scientist");
        occupation.setIndustry("AI and ML");
        occupation.setExperienceYears(5);
        occupation.setIsRemote(false);
        occupation.setSalary(90000);
        System.out.println("\n");
        System.out.println("updated details are");
        System.out.println("Updated Job Title is"+occupation.getJobTitle());
        System.out.println("Updated Industry is"+occupation.getIndustry());
        System.out.println("Updated Years of Experience is"+occupation.getExperienceYears());
        System.out.println("Is Remote Now is"+occupation.getIsRemote());
        System.out.println("Updated Salary is "+occupation.getSalary());
    }

}
