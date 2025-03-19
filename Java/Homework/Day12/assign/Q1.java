class Q1{
	public static void main(String []args){
		String a=null;
		try{
			int b=a.length();
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Finished");
	}
}