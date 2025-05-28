class SirenRunner{
public static void main(String[] args){
Siren siren=new Siren();
System.out.println("The defualt value for is soundtype"+siren.soundtype);
System.out.println("The defualt value for is volume"+siren.volume);
System.out.println("The defualt value for is isloud"+siren.isloud);
System.out.println("The defualt value for is color"+siren.color);
siren.soundtype="alarm";
siren.volume=30;
siren.isloud=true;
siren.color="Gold";
System.out.println("The soundtype value for is soundtype"+siren.soundtype);
System.out.println("The volume value for is volume"+siren.volume);
System.out.println("The isloud value for is isloud"+siren.isloud);
System.out.println("The color value for is color"+siren.color);

}

}