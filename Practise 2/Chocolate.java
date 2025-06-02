class Chocolate {
    String name;
    String brand;
    String type;
    int weight;
    double price;
    boolean hasNuts;
    boolean isDarkChocolate;
    boolean isSugarFree;
    int cocoaPercentage;
    boolean hasCaramel;
    boolean hasWafer;
    boolean isVegan;
    boolean isImported;
    String countryOfOrigin;
    String packagingType;
    int shelfLife;
    boolean limitedEdition;
    boolean seasonal;
    String introducedYear;

    public Chocolate(String name, String brand, String type, int weight, double price, boolean hasNuts, boolean isDarkChocolate,
                     boolean isSugarFree, int cocoaPercentage, boolean hasCaramel, boolean hasWafer, boolean isVegan, 
                     boolean isImported, String countryOfOrigin, String packagingType, int shelfLife, boolean limitedEdition,
                     boolean seasonal, String introducedYear) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.hasNuts = hasNuts;
        this.isDarkChocolate = isDarkChocolate;
        this.isSugarFree = isSugarFree;
        this.cocoaPercentage = cocoaPercentage;
        this.hasCaramel = hasCaramel;
        this.hasWafer = hasWafer;
        this.isVegan = isVegan;
        this.isImported = isImported;
        this.countryOfOrigin = countryOfOrigin;
        this.packagingType = packagingType;
        this.shelfLife = shelfLife;
        this.limitedEdition = limitedEdition;
        this.seasonal = seasonal;
        this.introducedYear = introducedYear;
    }

    public void display() {
        System.out.println("Chocolate Name is"+name);
        System.out.println("Brand is"+brand);
        System.out.println("Type is"+type);
        System.out.println("Weight is" +weight);
        System.out.println("Price is"+price);
        System.out.println("Has Nuts is"+hasNuts);
        System.out.println("Is Dark Chocolate is"+isDarkChocolate);
        System.out.println("Is Sugar-Free is"+isSugarFree);
        System.out.println("Cocoa Percentage is"+cocoaPercentage);
        System.out.println("Has Caramel is"+hasCaramel);
        System.out.println("Has Wafer is"+hasWafer);
        System.out.println("Is Vegan is"+isVegan);
        System.out.println("Is Imported is"+isImported);
        System.out.println("Country of Origin is"+countryOfOrigin);
        System.out.println("Packaging Type is"+packagingType);
        System.out.println("Shelf Life is"+shelfLife);
        System.out.println("Limited Edition is"+limitedEdition);
        System.out.println("Seasonal is"+seasonal);
        System.out.println("Introduced Year is"+introducedYear);
        System.out.println("\n");
    }
}
