class CraneRunner{
public static void main(String[] args){
Crane crane=new Crane();
System.out.println("The Default value for name "+crane.model);
System.out.println("The Default value for age"+crane.capacity);
System.out.println("The Default value for disease"+crane.height);
System.out.println("The Default value for admitted"+crane.isMobile);
crane.model="XCMG XCT80L5";
crane.capacity=80;
crane.height=45.5;
crane.isMobile=true;
System.out.println("The intilized value for model "+crane.model);
System.out.println("The intilized value for capacity"+crane.capacity);
System.out.println("The intilized value for height"+crane.height);
System.out.println("The intilized value for isMobile"+crane.isMobile);


}
}