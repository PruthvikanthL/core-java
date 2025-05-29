class TerraceRunner{
public static void main(String[] args){
	
Terrace terrace=new Terrace();
System.out.println("The default value for number of chairsis\t"+terrace.chairs);
System.out.println("The Default value for color is \t"+terrace.color);
System.out.println("The Default value for light is\t"+terrace.light);
System.out.println("The Default value for plants is \t"+terrace.plants);
terrace.chairs=8;
terrace.light=true;
terrace.color="Green";
terrace.plants=2;
System.out.println("The values after intializing ");
System.out.println("The number of chairs"+terrace.chairs);
System.out.println("The light  is"+terrace.light);
System.out.println("The color is "+terrace.color);
System.out.println("the number of plants"+terrace.plants);
}

}