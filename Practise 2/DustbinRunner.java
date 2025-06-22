class DustbinRunner{
	public static void main(String[] args){
		 Dustbin dustbin1 = new Dustbin("Plastic",20,"Green","Round",15,20,12,"Swing",true,false,false,1,
		 true,false,false,"Indoor","Eco Earth",150.0,true,"Home");
        dustbin1.display();
		Dustbin dustbin2 = new Dustbin("Metal",50,"Silver","Rectangular",50,40,35,"Touchless",false,true, 
		true,2,false,true,true,"Outdoor","SmartBin",500.0,true,"Public");
        dustbin2.display();
		Dustbin dustbin3 = new Dustbin("Wood",35,"Brown","Round",30,30,35,"Swing",true,false,false,1,false,false,
		false,"Both","Eco Clean",300.0,true,"Both");
        dustbin3.display();
	}
 
 
 
 
 } 		