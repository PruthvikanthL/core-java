class DistCostRunner{
	
	public static void main(String[] args){
		String s="Challekere";
		String d="bng";
		int cost=DistCost.getCostBySourceAndDestination(s,d);
		System.out.println("cost from "+s+"to"+d+"is"+cost);
		String s1="Challekere";
		String d1="durga";
		int cost1=DistCost.getCostBySourceAndDestination(s1,d1);
		System.out.println("cost from "+s1+"to"+d1+"is"+cost1);
		String s2="Challekere";
		String d2="ballary";
		int cost2=DistCost.getCostBySourceAndDestination(s2,d2);
		System.out.println("cost from "+s2+"to"+d2+"is"+cost2);
		String s3="Challekere";
		String d3="Pavagada";
		int cost3=DistCost.getCostBySourceAndDestination(s3,d3);
		System.out.println("cost from "+s3+"to"+d3+"is"+cost3);
		String s4="Challekere";
		String d4="Davanagere";
		int cost4=DistCost.getCostBySourceAndDestination(s4,d4);
		System.out.println("cost from "+s4+"to"+d4+"is"+cost4);
		String s5="Challekere";
		String d5="Hiriyur";
		int cost5=DistCost.getCostBySourceAndDestination(s5,d5);
		System.out.println("cost from "+s5+"to"+d5+"is"+cost5);
		String s6="Challekere";
		String d6="Tumkur";
		int cost6=DistCost.getCostBySourceAndDestination(s6,d6);
		System.out.println("cost from "+s6+"to"+d6+"is"+cost6);
		String s7="Challekere";
		String d7="sira";
		int cost7=DistCost.getCostBySourceAndDestination(s7,d7);
		System.out.println("cost from "+s7+"to"+d7+"is"+cost7);
		String s8="Challekere";
		String d8="pune";
		int cost8=DistCost.getCostBySourceAndDestination(s8,d8);
		System.out.println("cost from "+s8+"to"+d8+"is"+cost8);
		String s9="Challekere";
		String d9="gujaratha";
		int cost9=DistCost.getCostBySourceAndDestination(s9,d9);
		System.out.println("cost from "+s9+"to"+d9+"is"+cost9);
		String s10="Challekere";
		String d10="rajasthan";
		int cost10=DistCost.getCostBySourceAndDestination(s10,d10);
		System.out.println("cost from "+s10+"to"+d10+"is"+cost10);
	}
}