class HairRunner{
public static void main(String[] args){
Hair hair=new Hair();
System.out.println("The default value of "+hair.color);
System.out.println("The default value of "+hair.length);
System.out.println("The default value of "+hair.iscurly);
System.out.println("The default value of "+hair.type);
hair.color="black";
hair.length=12;
hair.iscurly=true;
hair.type="Ring";
System.out.println("The value intialized value for color is"+hair.color);
System.out.println("The value intialized value for length is"+hair.length);
System.out.println("The value intialized value for iscurly is"+hair.iscurly);
System.out.println("The value intialized value for color is"+hair.type);

}


}