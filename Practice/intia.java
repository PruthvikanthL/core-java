class intia {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 20;
        System.out.println("Before re initialization by reference = " + num);
        num = num1;
        System.out.println("After re initialization by reference = " + num);
        
        float price = 20.0f;
        float rate = 40.0f;
        System.out.println("Price Before re initialization by reference = " + price);
        price = rate;
        System.out.println("Price After re initialization by reference = " + price);
        
        char Grade = 'A';
        char quality;
        quality = Grade;
        System.out.println("Quality value by initialization reference = " + quality);
        
        String name = "Pruthvi";
        String original_name;  
        original_name = name;  
        System.out.println("The original_name by reference = " + original_name);
        
        long MRP = 20000000L;
        long cost;
        cost = MRP;
        System.out.println("The cost is " + cost);
        
        double measurement = 20.999;
        double inches;
        inches = measurement;
        System.out.println("The measurement in inches is = " + inches);
        
        boolean wheather = true;
        boolean rainy;  
        rainy = false;
        rainy = wheather;
        System.out.println("Weather today rainy or not = " + rainy); 
        
        byte a = 1;
        byte b;
        b = a;
        System.out.println("The byte value for b is " + b);
    }
}
