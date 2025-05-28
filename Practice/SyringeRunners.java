class SyringeRunner {
    public static void main(String[] args) {
        int qty = 5;
        String medName = "Paracetamol";
        String nurse = "Sunitha";
        
        Syringe.details(qty, medName, nurse);
        Syringe.inject(true);
        System.out.println("");
        
        qty = 10;
        medName = "Ibuprofen";
        nurse = "Vanitha";
        
        Syringe.details(qty, medName, nurse);
        Syringe.inject(true);
        System.out.println("");
        
        qty = 8;
        medName = "Amoxicillin";
        nurse = "Radhika";
        
        Syringe.details(qty, medName, nurse);
        Syringe.inject(true);
        System.out.println("");
        
        qty = 12;
        medName = "Ciprofloxacin";
        nurse = "Ruchitha";
        
        Syringe.details(qty, medName, nurse);
        Syringe.inject(true);
        System.out.println("");
        
        qty = 6;
        medName = "Doxycycline";
        nurse = "Liki";
        
        Syringe.details(qty, medName, nurse);
        Syringe.inject(true);
    }
}