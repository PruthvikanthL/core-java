class Cement {
    String cementId;
    double weight;
    String type;
    String origin;
    boolean packed;
    int quantity;
    String grade;
    long manufacturingDate;
    String handlingInstructions;
    boolean exportQuality;

    public Cement(){
		
	}

    public Cement(String cementId) {
        this.cementId = cementId;
    }

    public Cement(String cementId,double weight) {
        this.cementId = cementId;
        this.weight = weight;
    }

    public Cement(String cementId,double weight,String type) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
    }

    public Cement(String cementId,double weight,String type,String origin) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
    }

    public Cement(String cementId,double weight,String type,String origin,boolean packed) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.packed = packed;
    }

    public Cement(String cementId,double weight,String type,String origin,boolean packed,int quantity) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.packed = packed;
        this.quantity = quantity;
    }

    public Cement(String cementId,double weight,String type,String origin,boolean packed,int quantity, 
	String grade) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.packed = packed;
        this.quantity = quantity;
        this.grade = grade;
    }

    public Cement(String cementId,double weight,String type,String origin,boolean packed,int quantity,
	String grade,long manufacturingDate) {
        this.cementId = cementId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.packed = packed;
        this.quantity = quantity;
        this.grade = grade;
        this.manufacturingDate = manufacturingDate;
    }

    public void display() {
        System.out.println("Cement ID is "+this.cementId);
        System.out.println("Weight is "+this.weight);
        System.out.println("Type is "+this.type);
        System.out.println("Origin is "+this.origin);
        System.out.println("Packed is "+this.packed);
        System.out.println("Quantity is "+this.quantity);
        System.out.println("Grade is "+this.grade);
        System.out.println("Manufacturing Date is "+this.manufacturingDate);
        System.out.println("Handling Instructions is "+this.handlingInstructions);
        System.out.println("Export Quality is "+this.exportQuality);
        System.out.println("\n");
    }
}
