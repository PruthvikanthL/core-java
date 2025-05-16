class Planet {
		String name;
		String type;
		int radius;
		int distancefromsun;
		boolean haslife;
		int numberofmoons;
		boolean hasrings;
		float gravity;
		boolean isdwarf;
		String color;
		boolean haswater;
		boolean supporthumanlife;
		boolean hasatmosphere;
		String mainelement;
		int rotationtime;
		int revolutiontime;
		boolean isgasgiant;
		boolean hasmagneticfield;
		String discoveredby;
		int discoveryyear;
		public Planet(String name,String type,int radius,int distancefromsun,boolean haslife,int numberofmoons,
		boolean hasrings,float gravity,boolean isdwarf,String color,boolean haswater,boolean supporthumanlife,
		boolean hasatmosphere,String mainelement,int rotationtime,int revolutiontime,boolean isgasgiant,boolean hasmagneticfield,
		String discoveredby,int discoveryyear){
			this.name=name;
			this.type=type;
			this.radius=radius;
			this.distancefromsun=distancefromsun;
			this.haslife=haslife;
			this.numberofmoons=numberofmoons;
			this.hasrings=hasrings;
			this.gravity=gravity;
			this.isdwarf=isdwarf;
			this.color=color;
			this.haswater=haswater;
			this.supporthumanlife=supporthumanlife;
			this.hasatmosphere=hasatmosphere;
			this.mainelement=mainelement;
			this.rotationtime=rotationtime;
			this.revolutiontime=revolutiontime;
			this.isgasgiant=isgasgiant;
			this.hasmagneticfield=hasmagneticfield;
			this.discoveredby=discoveredby;
			this.discoveryyear=discoveryyear;
			
			}
public void display(){
	System.out.println("The name is"+name);
	System.out.println("The type"+type);
	System.out.println("The radius"+radius);
	System.out.println("The distancefromsun"+distancefromsun);
	System.out.println("The haslife is"+haslife);
	System.out.println("The numberofmoons is"+numberofmoons);
	System.out.println("The hasrings is"+hasrings);
	System.out.println("The gravity is"+gravity);
	System.out.println("The isdwarf"+isdwarf);
	System.out.println("The color is"+color);
	System.out.println("The haswater"+haswater);
	System.out.println("The supporthumanlife is"+supporthumanlife);
	System.out.println("The hasatmosphere"+hasatmosphere);
	System.out.println("The mainelement is"+mainelement);
	System.out.println("The rotationtime is"+rotationtime);
	System.out.println("The revolutiontime is"+revolutiontime);
	System.out.println("The isgasgiant is"+isgasgiant);
	System.out.println("The hasmagneticfield"+hasmagneticfield);
	System.out.println("The discoveredby"+discoveredby);
	System.out.println("The discoveryyear"+discoveryyear);
}








}