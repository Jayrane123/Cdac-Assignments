class Q2{
	public static void main(String []args){
		int a=22;
		int b=0;
		try{
			int c=a/b;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Finished");
	}
}