class Dustbin {
    String material;
    int capacity;
    String color;
    String shape;
    int height;
    int width;
    int depth;
    String lidtype;
    boolean footpedal;
    boolean sensorenabled;
    boolean odorcontrol;
    int compartmentcount;
    boolean wheels;
    boolean recyclingsupport;
    boolean fireresistant;
    String indooroutdoor;
    String brand;
    float price;
    boolean removableliner;
    String usagetype;
public Dustbin(String material, int capacity, String color, String shape, int height, int width, int depth, String lidtype,
          boolean footpedal, boolean sensorenabled, boolean odorcontrol, int compartmentcount, boolean wheels, 
          boolean recyclingsupport, boolean fireresistant, String indooroutdoor, String brand, float price, 
          boolean removableliner, String usagetype) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.shape = shape;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.lidtype = lidtype;
        this.footpedal = footpedal;
        this.sensorenabled = sensorenabled;
        this.odorcontrol = odorcontrol;
        this.compartmentcount = compartmentcount;
        this.wheels = wheels;
        this.recyclingsupport = recyclingsupport;
        this.fireresistant = fireresistant;
        this.indooroutdoor = indooroutdoor;
        this.brand = brand;
        this.price = price;
        this.removableliner = removableliner;
        this.usagetype = usagetype;
    }
		public void display() {
        System.out.println("Material is"+material);
        System.out.println("Capacity is"+capacity );
        System.out.println("Color is"+color);
        System.out.println("Shape is"+shape);
        System.out.println("Height is"+height );
        System.out.println("Width is"+width );
        System.out.println("Depth is"+depth );
        System.out.println("Lid Type is"+lidtype);
        System.out.println("Foot Pedal is "+footpedal);
        System.out.println("Sensor Enabled is "+sensorenabled);
        System.out.println("Odor Control is"+odorcontrol);
        System.out.println("Compartment Countis"+compartmentcount);
        System.out.println("Wheels is" + wheels);
        System.out.println("Recycling Support is"+recyclingsupport);
        System.out.println("Fire Resistant is"+fireresistant);
        System.out.println("Indoor/Outdoor is "+indooroutdoor);
        System.out.println("Brand is "+brand);
        System.out.println("Price is"+price);
        System.out.println("Removable Liner is"+removableliner);
        System.out.println("Usage Type is"+usagetype);
        System.out.println("\n");
    }
}