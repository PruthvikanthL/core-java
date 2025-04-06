class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; 
        int n = 2; 
      
       for (int i = 0;i < n;i++) {
            int temp = arr[0]; 
            int start = 0;
            int end = arr.length-1;
            for (int j=start;j<	end;j++) {
                arr[j]=arr[j+1];
            }

            arr[end]=temp; 
			
			}
			for(int m=0;m<arr.length;m++){
			System.out.print(arr[m]);}
        }
	}
      