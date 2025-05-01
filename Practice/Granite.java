class Granite {
    String graniteId;
    double weight;
    String type;
    String origin;
    boolean polished;
    int quantity;
    String grade;
    long extractionDate;
    String handlingInstructions;
    boolean exportQuality;

    public Granite() {
    }

    public Granite(String graniteId) {
        this.graniteId = graniteId;
    }

    public Granite(String graniteId,double weight) {
        this.graniteId = graniteId;
        this.weight = weight;
    }

    public Granite(String graniteId,double weight,String type) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
    }

    public Granite(String graniteId,double weight,String type,String origin) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished,int quantity) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
        this.quantity = quantity;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished,int quantity,
	String grade) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
        this.quantity = quantity;
        this.grade = grade;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished,int quantity,
	String grade,long extractionDate) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
        this.quantity = quantity;
        this.grade = grade;
        this.extractionDate = extractionDate;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished,int quantity, 
	String grade,long extractionDate,String handlingInstructions) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
        this.quantity = quantity;
        this.grade = grade;
        this.extractionDate = extractionDate;
        this.handlingInstructions = handlingInstructions;
    }

    public Granite(String graniteId,double weight,String type,String origin,boolean polished,int quantity,
	String grade,long extractionDate,String handlingInstructions,boolean exportQuality) {
        this.graniteId = graniteId;
        this.weight = weight;
        this.type = type;
        this.origin = origin;
        this.polished = polished;
        this.quantity = quantity;
        this.grade = grade;
        this.extractionDate = extractionDate;
        this.handlingInstructions = handlingInstructions;
        this.exportQuality = exportQuality;
    }

    public void display() {
        System.out.println("Granite ID is " + this.graniteId);
        System.out.println("Weight is " + this.weight);
        System.out.println("Type is" + this.type);
        System.out.println("Origin is" + this.origin);
        System.out.println("Polished is" + this.polished);
        System.out.println("Quantity is" + this.quantity);
        System.out.println("Grade is" + this.grade);
        System.out.println("Extraction Date is" + this.extractionDate);
        System.out.println("Handling Instructions is" + this.handlingInstructions);
        System.out.println("Export Quality is" + this.exportQuality);
        System.out.println("\n");
    }
}