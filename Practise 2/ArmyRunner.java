class ArmyRunner {
    public static void main(String[] args) {
        Army army1 = new Army();
        army1.display();

        String armyId2 = "A002";
        Army army2 = new Army(armyId2);
        army2.display();

        String armyId3 = "A003";
        int soldiers3 = 70000;
        Army army3 = new Army(armyId3,soldiers3);
        army3.display();

        String armyId4 = "A004";
        int soldiers4 = 90000;
        String country4 = "India";
        Army army4 = new Army(armyId4,soldiers4,country4);
        army4.display();

        String armyId5 = "A005";
        int soldiers5 = 120000;
        String country5 = "Russia";
        String branch5 = "Air Force";
        Army army5 = new Army(armyId5,soldiers5,country5,branch5);
        army5.display();

        String armyId6 = "A006";
        int soldiers6 = 150000;
        String country6 = "China";
        String branch6 = "Navy";
        boolean active6 = true;
        Army army6 = new Army(armyId6,soldiers6,country6,branch6,active6);
        army6.display();

        String armyId7 = "A007";
        int soldiers7 = 180000;
        String country7 = "UK";
        String branch7 = "Special Forces";
        boolean active7 = true;
        int vehicles7 = 500;
        Army army7 = new Army(armyId7,soldiers7,country7,branch7,active7,vehicles7);
        army7.display();

        String armyId8 = "A008";
        int soldiers8 = 210000;
        String country8 = "France";
        String branch8 = "Armored Division";
        boolean active8 = true;
        int vehicles8 = 800;
        String general8 = "General Lucas";
        Army army8 = new Army(armyId8,soldiers8,country8,branch8,active8,vehicles8,general8);
        army8.display();

        String armyId9 = "A009";
        int soldiers9 = 250000;
        String country9 = "Germany";
        String branch9 = "Cyber Warfare";
        boolean active9 = true;
        int vehicles9 = 300;
        String general9 = "General Weber";
        String division9 = "3rd Cyber Unit";
        Army army9 = new Army(armyId9,soldiers9,country9,branch9,active9,vehicles9,general9,division9);
        army9.display();

        String armyId10 = "A010";
        int soldiers10 = 300000;
        String country10 = "Japan";
        String branch10 = "Artillery";
        boolean active10 = true;
        int vehicles10 = 700;
        String general10 = "General Tanaka";
        String division10 = "5th Artillery Division";
        int foundedYear10 = 1950;
        Army army10 = new Army(armyId10,soldiers10,country10,branch10,active10,vehicles10,general10,
		division10,foundedYear10);
        army10.display();
    }
}
