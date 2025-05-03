class JamoonRunner{
public static void main(String[] args){
Jamoon jamoon=new Jamoon();
System.out.println("The default value for color is "+jamoon.color);
System.out.println("The default value for size is "+jamoon.size);
System.out.println("The default value for issweet is "+jamoon.issweet);
System.out.println("The default value for type is "+jamoon.type);
jamoon.color="Blue";
jamoon.size=15;
jamoon.issweet=true;
jamoon.type="Gulab Jamunu";
System.out.println("The color value after intialization is"+jamoon.color);
System.out.println("The color value after intialization is"+jamoon.size);
System.out.println("The color value after intialization is"+jamoon.issweet);
System.out.println("The color value after intialization is"+jamoon.type);


}

}