class DistCost{
static int getCostBySourceAndDestination(String source,String destination){
	if(source=="Challekere"&&destination=="bng"){
		int c=250;
		return c;
	}
	else if(source=="Challekere"&&destination=="durga"){
		int c=30;
		return c;
	}
	else if(source=="Challekere"&&destination=="ballary"){
		int c=150;
		return c;
	}
	else if(source=="Challekere"&&destination=="Pavagada"){
		int c=80;
		return c;
	}
	else if(source=="Challekere"&&destination=="Davanagere"){
		int c=90;
		return c;
	}
	else if(source=="Challekere"&&destination=="Hiriyur"){
		int c=50;
		return c;
	}
	else if(source=="Challekere"&&destination=="Tumkur"){
		int c=150;
		return c;
	}
	else if(source=="Challekere"&&destination=="sira"){
		int c=180;
		return c;
	}
	else if(source=="Challekere"&&destination=="pune"){
		int c=500;
		return c;
	}
	else if(source=="Challekere"&&destination=="gujaratha"){
		int c=1500;
		return c;
	}
	else if(source=="Challekere"&&destination=="rajasthan"){
		int c=2000;
		return c;
	}
	else {
		System.out.println("sorry we dont have a location cost");
		return 0;
	}
	
}

}