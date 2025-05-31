class BedConRunner{
public static void main(String[] args){
BedCon bed=new BedCon();
System.out.println("The Default values for pillows is"+bed.pillows);
System.out.println("The Default values for color is"+bed.color);
System.out.println("The Default values for blanket is"+bed.blanket);
System.out.println("The Default values for size is"+bed.size);
bed.pillows=5;
bed.color="Blue";
bed.blanket=true;
bed.size=10;
System.out.println("The values after intialization");
System.out.println("The pillows values is"+bed.pillows);
System.out.println("The color values is"+bed.color);
System.out.println("The blanket values is"+bed.blanket);
System.out.println("The size values is"+bed.size);


}

}