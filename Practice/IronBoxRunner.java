class IronBoxRunner{
public static void main(String[] args){
	IronBox ironbox=new IronBox();
	System.out.println("The Default value for brand"+ironbox.brand);
	System.out.println("The Default value for power"+ironbox.issteam);
	System.out.println("The Default value for brand"+ironbox.power);
	System.out.println("The Default value for brand"+ironbox.color);
	ironbox.brand="Usha";
	ironbox.issteam=true;
	ironbox.power=5;
	ironbox.color="Blue";
	System.out.println("The intialized value for brand"+ironbox.brand);
	System.out.println("The intialized value for power"+ironbox.issteam);
	System.out.println("The intialized value for brand"+ironbox.power);
	System.out.println("The intialized value for brand"+ironbox.color);
	

}

}