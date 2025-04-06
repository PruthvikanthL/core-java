class ArrRot{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		int start=0,n=1;
		int end=arr.length-1;
	while(start<n){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	System.out.println("Array after number of shifts");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
	}
	}
}