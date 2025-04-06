class Army {
    String armyId;
    int soldiers;
    String country;
    String branch;
    boolean isActive;
    int vehicles;
    String general;
    String division;
    int yearEstablished;
    double budget;

    public Army() {}

    public Army(String armyId) {
        this.armyId = armyId;
    }

    public Army(String armyId,int soldiers) {
        this.armyId = armyId;
        this.soldiers = soldiers;
    }

    public Army(String armyId,int soldiers,String country) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
    }

    public Army(String armyId, int soldiers,String country,String branch) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive,int vehicles) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
        this.vehicles = vehicles;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive,int vehicles,
	String general) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
        this.vehicles = vehicles;
        this.general = general;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive,int vehicles,
	String general,String division) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
        this.vehicles = vehicles;
        this.general = general;
        this.division = division;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive,int vehicles,
	String general,String division,int yearEstablished) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
        this.vehicles = vehicles;
        this.general = general;
        this.division = division;
        this.yearEstablished = yearEstablished;
    }

    public Army(String armyId,int soldiers,String country,String branch,boolean isActive,int vehicles,String general,
	String division,int yearEstablished,double budget) {
        this.armyId = armyId;
        this.soldiers = soldiers;
        this.country = country;
        this.branch = branch;
        this.isActive = isActive;
        this.vehicles = vehicles;
        this.general = general;
        this.division = division;
        this.yearEstablished = yearEstablished;
        this.budget = budget;
    }

    public void display() {
        System.out.println("Army ID is" + this.armyId);
        System.out.println("Soldiers is" + this.soldiers);
        System.out.println("Country is" + this.country);
        System.out.println("Branch is" + this.branch);
        System.out.println("Is Active is" + this.isActive);
        System.out.println("Vehicles is" + this.vehicles);
        System.out.println("General is" + this.general);
        System.out.println("Division is" + this.division);
        System.out.println("Year Established is" + this.yearEstablished);
        System.out.println("Budget is" + this.budget);
        System.out.println("\n");
    }
}
