class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.display();

        String owner1 = "Adarsh M";
        Wallet wallet1 = new Wallet(owner1);
        wallet1.display();

        String owner2 = "Amurth";
        String bank2 = "SBI";
        Wallet wallet2 = new Wallet(owner2, bank2);
        wallet2.display();

        String owner3 = "Shikar";
        String bank3 = "ICICI";
        double balance3 = 15000.50;
        Wallet wallet3 = new Wallet(owner3, bank3, balance3);
        wallet3.display();

        String owner4 = "Chiru";
        String bank4 = "HDFC";
        double balance4 = 22000.75;
        String type4 = "Savings";
        Wallet wallet4 = new Wallet(owner4, bank4, balance4, type4);
        wallet4.display();

        String owner5 = "Darshan";
        String bank5 = "Axis";
        double balance5 = 18000.00;
        String type5 = "Current";
        boolean isActive5 = true;
        Wallet wallet5 = new Wallet(owner5, bank5, balance5, type5, isActive5);
        wallet5.display();

        String owner6 = "Suhas";
        String bank6 = "Kotak";
        double balance6 = 25000.00;
        String type6 = "Salary";
        boolean isActive6 = true;
        int transactions6 = 30;
        Wallet wallet6 = new Wallet(owner6, bank6, balance6, type6, isActive6, transactions6);
        wallet6.display();

        String owner7 = "Charan";
        String bank7 = "Yes Bank";
        double balance7 = 12000.00;
        String type7 = "Digital";
        boolean isActive7 = false;
        int transactions7 = 20;
        String currency7 = "INR";
        Wallet wallet7 = new Wallet(owner7, bank7, balance7, type7, isActive7, transactions7, currency7);
        wallet7.display();

        String owner8 = "Sunil";
        String bank8 = "Bank of Baroda";
        double balance8 = 32000.00;
        String type8 = "Joint";
        boolean isActive8 = true;
        int transactions8 = 50;
        String currency8 = "USD";
        long createdAt8 = 1678945600L;
        Wallet wallet8 = new Wallet(owner8, bank8, balance8, type8, isActive8, transactions8, currency8, createdAt8);
        wallet8.display();

        String owner9 = "Nikethan";
        String bank9 = "PNB";
        double balance9 = 45000.00;
        String type9 = "Business";
        boolean isActive9 = false;
        int transactions9 = 15;
        String currency9 = "EUR";
        long createdAt9 = 1678945650L;
        String pin9 = "1234";
        Wallet wallet9 = new Wallet(owner9, bank9, balance9, type9, isActive9, transactions9, currency9, createdAt9, pin9);
        wallet9.display();

        String owner10 = "Sudeep";
        String bank10 = "Union Bank";
        double balance10 = 50000.00;
        String type10 = "Platinum";
        boolean isActive10 = true;
        int transactions10 = 40;
        String currency10 = "GBP";
        long createdAt10 = 1678945700L;
        String pin10 = "9876";
        boolean isVerified10 = true;
        Wallet wallet10 = new Wallet(owner10, bank10, balance10, type10, isActive10, transactions10, currency10, createdAt10, pin10, isVerified10);
        wallet10.display();
    }
}
