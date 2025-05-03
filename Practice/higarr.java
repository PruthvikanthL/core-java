class higarr{
	public static void main(String[] args){
		int[] arr={10,20,44,25,2,0,50};
		int big=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=big){
				big=arr[i];
			}
		}System.out.println("The bigger of the given Arraya is \t"+big);
	}
}