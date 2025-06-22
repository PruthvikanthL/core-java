class Drone{
		String name;
		String manufacturer;
		String type;
		int weight;
		int maxspeed;
		int flightime;
		boolean hascamera;
		int range;
		String batterytype;
		boolean isautonomous;
		boolean hasgps;
		int maxaltitude;
		boolean usedfordelivery;
		boolean usedforsurveillance;
		boolean usedforphotography;
		boolean hasobstacleavoidance;
		String communicationtype;
		int numberofrotors;
		boolean waterproof;
		int maxpayload;
		
		public Drone(String name,String manufacturer,String type,int weight,int maxspeed,int flightime,boolean hascamera,
		int range,String batterytype,boolean isautonomous,boolean hasgps,int maxaltitude,boolean usedfordelivery,boolean usedforsurveillance,
		boolean usedforphotography,boolean hasobstacleavoidance,String communicationtype,int numberofrotors,boolean waterproof,
		int maxpayload){
			this.name=name;
			this.manufacturer=manufacturer;
			this.type=type;
			this.weight=weight;
			this.maxspeed=maxspeed;
			this.flightime=flightime;
			this.hascamera=hascamera;
			this.range=range;
			this.batterytype=batterytype;
			this.isautonomous=isautonomous;
			this.hasgps=hasgps;
			this.maxaltitude=maxaltitude;
			this.usedfordelivery=usedfordelivery;
			this.usedforsurveillance=usedforsurveillance;
			this.usedforphotography=usedforphotography;
			this.hasobstacleavoidance=hasobstacleavoidance;
			this.communicationtype=communicationtype;
			this.numberofrotors=numberofrotors;
			this.waterproof=waterproof;
			this.maxpayload=maxpayload;
		}
		public void display(){
			System.out.println("The name is "+name);
			System.out.println("The manufacturer is"+manufacturer);
			System.out.println("The type"+type);
			System.out.println("The weight"+weight);
			System.out.println("The maxspeed"+maxspeed);
			System.out.println("The flightime is"+flightime);
			System.out.println("The hascamera is"+hascamera);
			System.out.println("The range is"+range);
			System.out.println("The batterytype is"+batterytype);
			System.out.println("The isautonomous"+isautonomous);
			System.out.println("The hasgps"+hasgps);
			System.out.println("The maxaltitude is"+maxaltitude);
			System.out.println("The usedfordelivery is"+usedfordelivery);
			System.out.println("The usedforsurveillance"+usedforsurveillance);
			System.out.println("The usedforphotography is"+usedforphotography);
			System.out.println("The hasobstacleavoidance is"+hasobstacleavoidance);
			System.out.println("The communicationtype is"+communicationtype);
			System.out.println("The numberofrotors is "+numberofrotors);
			System.out.println("The waterproof is"+waterproof);
			System.out.println("The maxpayload is"+maxpayload);
			System.out.println("\n");
		}


}