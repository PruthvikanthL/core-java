class HangerRunner{
public static void main(String[] args){
	Hanger hanger=new Hanger();
	System.out.println("The material default value is"+hanger.material);
	System.out.println("The color default value is"+hanger.color);
	System.out.println("The hasHook default value is"+hanger.hasHook);
	System.out.println("The width default value is"+hanger.width);
	hanger.material="silicon";
	hanger.color="pink";
	hanger.hasHook=true;
	hanger.width=12;
	System.out.println("The material value after initialization is"+hanger.material);
	System.out.println("The color value after initialization is"+hanger.color);
    System.out.println("The hasHook value after initialization is"+hanger.hasHook);
	System.out.println("The width value after initialization is"+hanger.width);

}

}