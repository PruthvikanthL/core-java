class DusterRunner{
public static void main(String[] args){
		Duster duster1 = new Duster("Microfiber","Plastic",15,200,"Whiteboard","High",true, 5,"all boards", 
		"Rectangular","Blue","Comfortable",3,"High",true,true,"Staedtler",true,"Box", "150");
        duster1.display();
		Duster duster2 = new Duster("Foam","Wooden",12,180,"Chalkboard","Medium",false,4,"Only Chalkboards","Oval",
		"Black","Moderate",2,"Medium",false,true,"Camlin",false,"Plastic Wrap", "200");
        duster2.display();
		Duster duster3 = new Duster("Synthetic","Rubber",14,190,"Glass Surface","Low",true,6,"all surfaces",
		"Round","Red","Soft",4,"Low",true,false,"Faber-Castell",true,"Eco Bag","300");
        duster3.display();
}

}