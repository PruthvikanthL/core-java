class Tab{
	String brand;
	String model;
	String color;
	int screensize;
	int resolution;
	String processor;
	int ram;
	int storage;
	int batterycapacity;
	String os;
	String cameraquality;
	int weight;
	int dimensions;
	String connectivity;
	String usbtype;
	String speakerquality;
	boolean pensupport;
	boolean fingerprint;
	int chargingspeed;
	int price;
	public Tab(String brand,String model,String color,int screensize,int resolution,String processor,
	int ram,int Storage,int batterycapacity,String os,String cameraquality,int weight,int dimensions,
	String connectivity,String usbtype,String speakerquality,boolean pensupport,boolean fingerprint,
	int chargingspeed,int price){
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.screensize=screensize;
		this.resolution=resolution;
		this.processor=processor;
		this.ram=ram;
		this.storage=storage;
		this.batterycapacity=batterycapacity;
		this.os=os;
		this.cameraquality=cameraquality;
		this.weight=weight;
		this.dimensions=dimensions;
		this.connectivity=connectivity;
		this.usbtype=usbtype;
		this.speakerquality=speakerquality;
		this.pensupport=pensupport;
		this.fingerprint=fingerprint;
		this.chargingspeed=chargingspeed;
		this.price=price;
		
		
	}
	public void show(){
		System.out.println("The brand name is"+brand);
		System.out.println("The model name is"+model);
		System.out.println("The color is"+color);
		System.out.println("The screensize"+screensize);
		System.out.println("The resolution is"+resolution);
		System.out.println("The processor is"+processor);
		System.out.println("The ram is"+ram);
		System.out.println("The storage is "+storage);
		System.out.println("The batterycapacity is"+batterycapacity);
		System.out.println("The os is"+os);
		System.out.println("The cameraquality is"+cameraquality);
		System.out.println("The weight is"+weight);
		System.out.println("the dimensions is"+dimensions);
		System.out.println("The connectivity is"+connectivity);
		System.out.println("The usbtype is"+usbtype);
		System.out.println("The speakerquality is"+speakerquality);
		System.out.println("The pensupport is"+pensupport);
		System.out.println("The fingerprint is"+fingerprint);
		System.out.println("The chargingspeed is"+chargingspeed);
		System.out.println("The price is"+price);
		System.out.println("\n");
			
	}





}