class AnchorRunner{
public static void main(String[] args){
	Anchor anchor=new Anchor();
	System.out.println("The defualt value for materaial is"+anchor.material);
	System.out.println("The defualt value for weight"+anchor.weight);
	System.out.println("The defualt value for isHeavy is"+anchor.isHeavy);
	System.out.println("The defualt value for shape is "+anchor.shape);
	anchor.material="brass";
	anchor.weight=20;
	anchor.isHeavy=true;
	anchor.shape="circle";
	System.out.println("The intialized value for material is"+anchor.material);
	System.out.println("The intialized value for weight is"+anchor.weight);
	System.out.println("The intialized value for isHeavy is"+anchor.isHeavy);
	System.out.println("The intialized value for shape is"+anchor.shape);
	
	
}


}