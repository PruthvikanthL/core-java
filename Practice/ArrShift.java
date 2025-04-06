class ArrShift{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		int start=arr[0];
		int end=arr[arr.length-1];
		int n=2;
		while(arr.length<n){
			int temp=start;
			start=end;
			end=temp;
			start++;
			end--;
			
		}
		for(int i=0;i<arr.length;i++){
		System.out.println("array is"+arr[i]);
		}
	}
}