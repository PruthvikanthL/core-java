class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {12, 21, 23, 33, 35, 40, 50, 60}; 
        int evenCount = 0, oddCount = 0;
        System.out.print("Even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evenCount++;
            } }System.out.println(); 
           System.out.print("Odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddCount++;
            } }
           System.out.println("\nCount of Even numbers: " + evenCount);
        System.out.println("Count of Odd numbers: " + oddCount);
    }
}
