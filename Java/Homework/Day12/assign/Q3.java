class Q3{
	public static void main(String []args){
		int []arr={1,2,3,4,5,6};
		try{
			int a=arr[6];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Finished");
	}
}