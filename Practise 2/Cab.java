class Cab{
	String Drivername;
	String carmodel;
	String licenseplate;
	String cabtype;
	int seats;
	String fueltype;
	boolean airconditioned;
	boolean available;
	float fareperkm;
	String company;
	boolean wifiavailable;
	boolean musicsystem;
	boolean gpsenabled;
	boolean babyseatavailable;
	String triptype;
	boolean smokingallowed;
	boolean petfriendly;
	String color;
	int modelyear;
	boolean sunroof;
	public Cab(String Drivername,String carmodel,String licenseplate,String cabtype,int seats,String fueltype,
	boolean airconditioned,boolean available,float fareperkm,String company,boolean wifiavailable,boolean musicsystem,
	boolean babyseatavailable,String triptype,boolean smokingallowed,boolean petfriendly,String color,int modelyear,boolean sunroof){
		this.Drivername=Drivername;
		this.carmodel=carmodel;
		this.licenseplate=licenseplate;
		this.cabtype=cabtype;
		this.seats=seats;
		this.fueltype=fueltype;
		this.airconditioned=airconditioned;
		this.available=available;
		this.fareperkm=fareperkm;
		this.company=company;
		this.wifiavailable=wifiavailable;
		this.musicsystem=musicsystem;
		this.gpsenabled=gpsenabled;
		this.babyseatavailable=babyseatavailable;
		this.triptype=triptype;
		this.smokingallowed=smokingallowed;
		this.petfriendly=petfriendly;
		this.color=color;
		this.modelyear=modelyear;
		this.sunroof=sunroof;
	}
	public void display(){
		System.out.println("The Drivername is"+Drivername);
		System.out.println("The carmodel is"+carmodel);
		System.out.println("The licenseplate is"+licenseplate);
		System.out.println("The cabtype is"+cabtype);
		System.out.println("The seats is"+seats);
		System.out.println("The fueltype is"+fueltype);
		System.out.println("The airconditioned is"+airconditioned);
		System.out.println("The available is"+available);
		System.out.println("The fareperkm is"+fareperkm);
		System.out.println("The airconditioned is"+airconditioned);
		System.out.println("The available is"+available);
		System.out.println("The fareperkm is"+fareperkm);
		System.out.println("The company is"+company);
		System.out.println("The wifiavailable is"+wifiavailable);
		System.out.println("the musicsystem is"+musicsystem);
		System.out.println("the gpsenabled is"+gpsenabled);
		System.out.println("The babyseatavailable is"+babyseatavailable);
		System.out.println("The triptype is"+triptype);
		System.out.println("The smokingallowed is"+smokingallowed);
		System.out.println("The petfriendly is"+petfriendly);
		System.out.println("The color is"+color);
		System.out.println("The modelyear is"+modelyear);
		System.out.println("The sunroof is"+sunroof);
		System.out.println("\n");
	}
	




}