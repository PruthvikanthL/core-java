class FloorRunner{
public static void main(String[] args){

Floor floor=new Floor();
System.out.println("The default value for number of Rooms is\t"+floor.numberofrooms);
System.out.println("The Default value for name is \t"+floor.floorname);
System.out.println("The Default value for Area is\t"+floor.area);
System.out.println("The Default value for tiles is \t"+floor.tiles);
floor.numberofrooms=8;
floor.floorname="Ground_Floor";
floor.area=577537;
floor.tiles=true;
System.out.println("The values after intializing ");
System.out.println("The number of Rooms"+floor.numberofrooms);
System.out.println("The floor name is"+floor.floorname);
System.out.println("The area number is "+floor.area);
System.out.println("is it consist tiles"+floor.tiles);
}
}