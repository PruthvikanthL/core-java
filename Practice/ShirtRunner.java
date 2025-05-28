class ShirtRunner{
public static void main(String[] args){

Shirt shirt=new Shirt();
System.out.println("The Default values for color is\t"+shirt.color);
System.out.println("The Default values for size is\t"+shirt.size);
System.out.println("The Default values for sleeves is\t"+shirt.sleeves);
System.out.println("The Default values for brand is\t"+shirt.brand);
shirt.color="Red";
shirt.size=10;
shirt.sleeves=true;
shirt.brand="puma";
System.out.println("The values after intialization");
System.out.println("The pillows color is"+shirt.color);
System.out.println("The color size is"+shirt.size);
System.out.println("The blanket sleeves is"+shirt.sleeves);
System.out.println("The size brand is"+shirt.brand);
}
}