public class Zip {
    String brand;
    String material;
    int length;
    String color;
    boolean isWaterproof;
    boolean isReversible;
    String type;
    String usage;
    String manufacturerCountry;
    boolean isAutoLock;
    boolean isInvisible;
    boolean isTwoWay;
    String specialty;
    double price;
    String countryOfOrigin;

    public Zip(String brand, String material, int length, String color, boolean isWaterproof,
               boolean isReversible, String type, String usage, String manufacturerCountry,
               boolean isAutoLock, boolean isInvisible, boolean isTwoWay, String specialty,
               double price, String countryOfOrigin) {
        this.brand = brand;
        this.material = material;
        this.length = length;
        this.color = color;
        this.isWaterproof = isWaterproof;
        this.isReversible = isReversible;
        this.type = type;
        this.usage = usage;
        this.manufacturerCountry = manufacturerCountry;
        this.isAutoLock = isAutoLock;
        this.isInvisible = isInvisible;
        this.isTwoWay = isTwoWay;
        this.specialty = specialty;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void display() {
        System.out.println("Zip Brand is\t"+brand);
        System.out.println("Material is\t"+material);
        System.out.println("Length is\t"+length);
        System.out.println("Color is\t"+color);
        System.out.println("Waterproof is\t"+isWaterproof);
        System.out.println("Reversible is\t"+isReversible);
        System.out.println("Type is\t"+type);
        System.out.println("Usage is\t"+usage);
        System.out.println("Manufacturer Country is\t"+manufacturerCountry);
        System.out.println("Auto Lock is\t"+isAutoLock);
        System.out.println("Invisible is\t"+isInvisible);
        System.out.println("Two-Way is\t"+isTwoWay);
        System.out.println("Specialty is\t"+specialty);
        System.out.println("Price is\t"+price);
        System.out.println("Country of Origin is\t"+countryOfOrigin);
        System.out.println("\n");
    }
}
