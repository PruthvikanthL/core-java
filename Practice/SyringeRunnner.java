class SyringeRunner {
    public static void main(String[] args) {
        int qty = 5;
        String medName = "Paracetamol";
        String nurse = "Sunitha";
        
        Syringe.s_details(qty, medName, nurse);
        Syringe.inject("yes");
        System.out.println("");
        
        qty = 10;
        medName = "Ibuprofen";
        nurse = "Vanitha";
        
        Syringe.s_details(qty, medName, nurse);
        Syringe.inject("yes");
        System.out.println("");
        
        qty = 8;
        medName = "Amoxicillin";
        nurse = "Radhika";
        
        Syringe.s_details(qty, medName, nurse);
        Syringe.inject("yes");
        System.out.println("");
        
        qty = 12;
        medName = "Ciprofloxacin";
        nurse = "Ruchitha";
        
        Syringe.s_details(qty, medName, nurse);
        Syringe.inject("yes");
        System.out.println("");
        
        qty = 6;
        medName = "Doxycycline";
        nurse = "Liki";
        
        Syringe.s_details(qty, medName, nurse);
        Syringe.inject("yes");
    }
}