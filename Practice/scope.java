class scope{
	public static void main(String[] args){
		int a=20;
		int b=33;
		{
			int result=a+b*2;
			System.out.println("The result is "+result);
			int m=2,n=0;
			System.out.println(m*n);
			
		}
		{
			int result2=m+n;
			System.out.println("we are fetching the values from the another scope as result"+result);
		}
	}
}