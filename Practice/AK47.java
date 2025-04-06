class AK47 {
    String model;
    int caliber;
    String manufacturer;
    String action;
    boolean isAutomatic;
    int magazineCapacity;
    String specialFeature;
    String country;
    int yearProduced;
    double weight;

    public AK47() {
		
	}

    public AK47(String model) {
        this.model = model;
    }

    public AK47(String model,int caliber) {
        this.model = model;
        this.caliber = caliber;
    }

    public AK47(String model,int caliber,String manufacturer) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
    }

    public AK47(String model,int caliber,String manufacturer,String action) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic, 
	int magazineCapacity) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
        this.magazineCapacity = magazineCapacity;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic,int magazineCapacity,
	String specialFeature) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
        this.magazineCapacity = magazineCapacity;
        this.specialFeature = specialFeature;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic, 
	int magazineCapacity,String specialFeature,String country) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
        this.magazineCapacity = magazineCapacity;
        this.specialFeature = specialFeature;
        this.country = country;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic,int magazineCapacity,
	String specialFeature,String country,int yearProduced) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
        this.magazineCapacity = magazineCapacity;
        this.specialFeature = specialFeature;
        this.country = country;
        this.yearProduced = yearProduced;
    }

    public AK47(String model,int caliber,String manufacturer,String action,boolean isAutomatic,int magazineCapacity, 
	String specialFeature,String country,int yearProduced,double weight) {
        this.model = model;
        this.caliber = caliber;
        this.manufacturer = manufacturer;
        this.action = action;
        this.isAutomatic = isAutomatic;
        this.magazineCapacity = magazineCapacity;
        this.specialFeature = specialFeature;
        this.country = country;
        this.yearProduced = yearProduced;
        this.weight = weight;
    }

    public void display() {
        System.out.println("Model is" + this.model);
        System.out.println("Caliber is" + this.caliber);
        System.out.println("Manufacturer is" + this.manufacturer);
        System.out.println("Action is" + this.action);
        System.out.println("Is Automatic is" + this.isAutomatic);
        System.out.println("Magazine Capacity is" + this.magazineCapacity);
        System.out.println("Special Feature is" + this.specialFeature);
        System.out.println("Country is" + this.country);
        System.out.println("Year Produced is" + this.yearProduced);
        System.out.println("Weight is" + this.weight + " kg");
        System.out.println("\n");
    }
}
