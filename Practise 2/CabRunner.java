class CabRunner{
public static void main(String[] args){
		Cab cab1 = new Cab("Adarsh", "Toyota Corolla","KA01EG2233","Sedan",4,"Petrol",true,true,10.5f,"Uber",true,
		true,true,"City",false,true,"White",2021,false);
        cab1.display();
		Cab cab2 = new Cab("Rangu","Honda CRV","KA16EH2256","SUV",6,"Diesel",true,false,12.0f,"Lyft",false,true,
		true,"Outstation",true,false,"Black",2020,true);
        cab2.display();
		Cab cab3 = new Cab("Surya","Tesla","KA16EG1122","Electric",4,"Electric",true,true,15.0f,"Ola",true,
		true,true,"Airport",false,true,"Red",2022,true);
        cab3.display();

}


}