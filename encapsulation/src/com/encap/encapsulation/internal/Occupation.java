package com.encap.encapsulation.internal;

public class Occupation {
    private String jobTitle = "Software Engineer";
    private String industry = "Information Technology";
    private int experienceYears = 3;
    private boolean isRemote = true;
    private double salary = 75000.50;

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    void setIsRemote(boolean isRemote) {
        this.isRemote = isRemote;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getIndustry() {
        return this.industry;
    }

    public int getExperienceYears() {
        return this.experienceYears;
    }

    public boolean getIsRemote() {
        return this.isRemote;
    }

    public double getSalary() {
        return this.salary;
    }
}
