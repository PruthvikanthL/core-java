class Cricket {
    public static void Matchinfo(String day, String... Pname) {
        System.out.println("The Match information is ...!\n");
        System.out.print("The players: ");
        
        for (String player : Pname) {
            System.out.print(player + " ");
        }
        
        System.out.println("\tare having a match on " + day);
    }
	public static void Matchinfo(String Name,int total,int run) {
		long runrate=95/100L;
        System.out.println("the player name is "+Name+"The avrege of the player is "+runrate);
		
    }
}