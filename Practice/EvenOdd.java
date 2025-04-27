class EvenOdd{
	public static void main(String[] args){
		int[] arr={2,3,6,10,42,23,46,70,30,20,10};
		int odd_count=0,even_count=0;
		System.out.println("The Even number\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
			 System.out.println("The Given number is even Number\t"+arr[i]);
			 even_count++;
			}
		}
		System.out.println("");
		System.out.println("The odd number\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
			 System.out.println("The Given number is odd Number\t"+arr[i]);
			 odd_count++;
			}
		}
					 System.out.println("The Total numbers of Even numbers\t"+even_count);
					 System.out.println("The Total numbers of odd numbers\t"+odd_count);

		
	}
}