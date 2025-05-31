class Bulb {
    String brand;
    int wattage;
    String type;
    String color;
    boolean isDimmable;
    String shape;
    int lifespan;
    double price;
    String energyRating;
    boolean isSmart;

    public Bulb() {
		
	}

    public Bulb(String brand) {
        this.brand = brand;
    }

    public Bulb(String brand,int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }

    public Bulb(String brand,int wattage,String type) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
    }

    public Bulb(String brand,int wattage,String type,String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
    }

    public Bulb(String brand,int wattage,String type,String color,boolean isDimmable) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
    }

    public Bulb(String brand,int wattage,String type,String color,boolean isDimmable,String shape) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
        this.shape = shape;
    }

    public Bulb(String brand,int wattage,String type,String color,boolean isDimmable,String shape,int lifespan) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
        this.shape = shape;
        this.lifespan = lifespan;
    }

    public Bulb(String brand,int wattage, String type,String color,boolean isDimmable,String shape,int lifespan, 
	double price) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
        this.shape = shape;
        this.lifespan = lifespan;
        this.price = price;
    }

    public Bulb(String brand,int wattage,String type,String color,boolean isDimmable,String shape,int lifespan, 
	double price,String energyRating) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
        this.shape = shape;
        this.lifespan = lifespan;
        this.price = price;
        this.energyRating = energyRating;
    }

    public Bulb(String brand,int wattage,String type,String color, boolean isDimmable,String shape,int lifespan,
	double price,String energyRating,boolean isSmart) {
        this.brand = brand;
        this.wattage = wattage;
        this.type = type;
        this.color = color;
        this.isDimmable = isDimmable;
        this.shape = shape;
        this.lifespan = lifespan;
        this.price = price;
        this.energyRating = energyRating;
        this.isSmart = isSmart;
    }

    public void display() {
        System.out.println("Brand is"+this.brand);
        System.out.println("Wattage is"+this.wattage + "W");
        System.out.println("Type is"+this.type);
        System.out.println("Color is"+this.color);
        System.out.println("Is Dimmable is"+this.isDimmable);
        System.out.println("Shape is"+this.shape);
        System.out.println("Lifespan is"+this.lifespan + " hours");
        System.out.println("Price is"+this.price);
        System.out.println("Energy Rating is"+this.energyRating);
        System.out.println("Is Smart is"+this.isSmart);
        System.out.println("\n");
    }
}
