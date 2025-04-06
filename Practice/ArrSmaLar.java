class ArrSmaLar{
	public static void main(String[] args){
		int[] arr={22,44,13,4,35,78};
		int bigval=arr[0];
		int smval=arr[0],seconlar=arr[0];
		for(int i=0;i<arr.length;i++){
			if(bigval<arr[i]){
				seconlar=bigval;
				bigval=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++){
			if(smval>arr[j]){
				smval=arr[j];
			}
		}
		System.out.println("The Biggest value in the array is"+bigval);
		System.out.println("The Biggest value in the array is"+smval);
		System.out.println("The Biggest value in the array is"+seconlar);

	}
}