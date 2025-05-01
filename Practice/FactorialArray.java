class FactorialArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 4}; 
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int fact = 1;

            
            for (int j = 1; j <= num; j++) {
                fact *= j;
            } System.out.println("Factorial of " + num + " is " + fact); }
    }
}
