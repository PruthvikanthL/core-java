class Wine {
    String name;
    String type;
    String origin;
    int year;
    double alcoholContent;
    String flavor;
    String winery;
    double price;
    boolean isAged;
    String foodPairing;

    public Wine() {}

    public Wine(String name) {
        this.name = name;
    }

    public Wine(String name,String type) {
        this.name = name;
        this.type = type;
    }

    public Wine(String name,String type,String origin) {
        this.name = name;
        this.type = type;
        this.origin = origin;
    }

    public Wine(String name,String type,String origin,int year) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent,String flavor) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
        this.flavor = flavor;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent,String flavor,String winery) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
        this.flavor = flavor;
        this.winery = winery;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent,String flavor, 
	String winery,double price) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
        this.flavor = flavor;
        this.winery = winery;
        this.price = price;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent,String flavor,
	String winery,double price,boolean isAged) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
        this.flavor = flavor;
        this.winery = winery;
        this.price = price;
        this.isAged = isAged;
    }

    public Wine(String name,String type,String origin,int year,double alcoholContent,String flavor, 
	String winery,double price,boolean isAged,String foodPairing) {
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.year = year;
        this.alcoholContent = alcoholContent;
        this.flavor = flavor;
        this.winery = winery;
        this.price = price;
        this.isAged = isAged;
        this.foodPairing = foodPairing;
    }

    public void display() {
        System.out.println("Name is "+this.name);
        System.out.println("Type is" +this.type);
        System.out.println("Origin is" +this.origin);
        System.out.println("Year is" +this.year);
        System.out.println("Alcohol Content is " +this.alcoholContent);
        System.out.println("Flavor is"+this.flavor);
        System.out.println("Winery is"+this.winery);
        System.out.println("Price is"+this.price);
        System.out.println("Is Aged is"+this.isAged);
        System.out.println("Food Pairing is"+this.foodPairing);
        System.out.println("\n");
    }
}
