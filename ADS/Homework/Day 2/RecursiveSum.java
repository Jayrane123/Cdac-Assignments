class RecursiveSum{
	static int sum(int n){
	    if(n>1){
		  return n+sum(n-1);
		}
		return 0;
	}
	public static void main(String []args){
		
		System.out.println((sum(10)));
		
	}	
}