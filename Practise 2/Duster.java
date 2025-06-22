class Duster {
    String material_type;
    String handle_type;
    int size;
    int weight;
    String cleaning_surface;
    String dust_retention;
    boolean washability;
    int durability;
    String board_compatibility;
    String shape;
    String color;
    String grip_comfort_level;
    int thickness;
    String absorption_efficiency;
    boolean dust_resistance;
    boolean reusability;
    String brand;
    boolean eco_friendly;
    String packaging_type;
    String cost;

    public Duster(String material_type, String handle_type, int size, int weight, String cleaning_surface,
                  String dust_retention, boolean washability, int durability, String board_compatibility,
                  String shape, String color, String grip_comfort_level, int thickness, String absorption_efficiency,
                  boolean dust_resistance, boolean reusability, String brand, boolean eco_friendly,
                  String packaging_type, String cost) {

        this.material_type = material_type;
        this.handle_type = handle_type;
        this.size = size;
        this.weight = weight;
        this.cleaning_surface = cleaning_surface;
        this.dust_retention = dust_retention;
        this.washability = washability;
        this.durability = durability;
        this.board_compatibility = board_compatibility;
        this.shape = shape;
        this.color = color;
        this.grip_comfort_level = grip_comfort_level;
        this.thickness = thickness;
        this.absorption_efficiency = absorption_efficiency;
        this.dust_resistance = dust_resistance;
        this.reusability = reusability;
        this.brand = brand;
        this.eco_friendly = eco_friendly;
        this.packaging_type = packaging_type;
        this.cost = cost; 
    }

    public void display() {
        System.out.println("Material Type is " + material_type);
        System.out.println("Handle Type is" + handle_type);
        System.out.println("Size is " + size);
        System.out.println("Weight is " + weight);
        System.out.println("Cleaning Surface is " + cleaning_surface);
        System.out.println("Dust Retention is" + dust_retention);
        System.out.println("Washability is " + washability);
        System.out.println("Durability is" + durability);
        System.out.println("Board Compatibility is" + board_compatibility);
        System.out.println("Shape is "" + shape);
        System.out.println("Color is" + color);
        System.out.println("Grip Comfort Level is" + grip_comfort_level);
        System.out.println("Thickness is" + thickness);
        System.out.println("Absorption Efficiency is" + absorption_efficiency);
        System.out.println("Dust Resistance is" + dust_resistance);
        System.out.println("Reusability is" + reusability);
        System.out.println("Brand is" + brand);
        System.out.println("Eco-Friendly is" + eco_friendly);
        System.out.println("Packaging Type is" + packaging_type);
        System.out.println("Cost is " + cost);
    }
}
