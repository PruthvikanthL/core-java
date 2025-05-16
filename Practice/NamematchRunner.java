class NamematchRunner{
	public static void main(String[] args){
		//String nameidneti="Kapoor";
		//String nameidneti="Sharma";
		String nameidneti="Shetty";

		if(nameidneti=="Kapoor"){
		String[] names=Namematchkapoor.kapoormatch();
		for(String na:names){
			System.out.println(na);
		}}
		else if(nameidneti=="Sharma"){
			String[] names1=NameMatchSharma.sharmamatching();
			for(String na1:names1){
				System.out.println(na1);
			}
		}
		else if(nameidneti=="Shetty"){
			String[] names2=NameMatchShetty.Shettymatching();
			for(String na2:names2){
				System.out.println(na2);
			}
		}
		else {
			System.out.println("Sorry We dont have any name matchiing this last name");
		}
	
	
	
	
	
	

	}
	
	

	
}