class Pallet {
    String palletid;
    double weightlimit;
    String material;
    String location;
    boolean isfull;
    int capacity;
    String modelnumber;
    long lastCheck;
    String instructions;
    boolean reusable;

    public Pallet(){
		
	}

    public Pallet(String palletid) {
        this.palletid = palletid;
    }

    public Pallet(String palletid,double weightlimit) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
    }

    public Pallet(String palletid,double weightlimit,String material) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
    }

    public Pallet(String palletid,double weightlimit,String material,String location) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
    }

    public Pallet(String palletid,double weightlimit,String material,String location,boolean isfull) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
    }

    public Pallet(String palletid, double weightlimit,String material,String location,boolean isfull,int capacity) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
        this.capacity = capacity;
    }

    public Pallet(String palletid,double weightlimit,String material,String location,boolean isfull,int capacity,String modelnumber) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
        this.capacity = capacity;
        this.modelnumber = modelnumber;
    }

    public Pallet(String palletid,double weightlimit,String material,String location,boolean isfull,int capacity,String modelnumber,long lastCheck) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
        this.capacity = capacity;
        this.modelnumber = modelnumber;
        this.lastCheck = lastCheck;
    }

    public Pallet(String palletid,double weightlimit,String material,String location,boolean isfull,int capacity,String modelnumber,long lastCheck,String instructions) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
        this.capacity = capacity;
        this.modelnumber = modelnumber;
        this.lastCheck = lastCheck;
        this.instructions = instructions;
    }

    public Pallet(String palletid,double weightlimit,String material,String location,boolean isfull,int capacity,String modelnumber,long lastCheck,String instructions,boolean reusable) {
        this.palletid = palletid;
        this.weightlimit = weightlimit;
        this.material = material;
        this.location = location;
        this.isfull = isfull;
        this.capacity = capacity;
        this.modelnumber = modelnumber;
        this.lastCheck = lastCheck;
        this.instructions = instructions;
        this.reusable = reusable;
    }

    public void display() {
        System.out.println("The palletid is"+this.palletid);
        System.out.println("The weightlimit is"+this.weightlimit);
        System.out.println("The materail is"+this.material);
        System.out.println("The location is"+this.location);
        System.out.println("The isfull is"+this.isfull);
        System.out.println("The capacity is"+this.capacity);
        System.out.println("The modelnumber is"+this.modelnumber);
        System.out.println("The lastCheck is"+this.lastCheck);
        System.out.println("The instructions is"+this.instructions);
        System.out.println("The reusable is"+this.reusable);
        System.out.println("\n");
    }
}