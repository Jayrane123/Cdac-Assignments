class ThrowDemo{
	void m1(){
		System.out.println("M1");
	}
	public static void main(String args[]){
		System.out.println("Started");
		ThrowDemo t=null;
		try{
			t.m1();//throw NullPointerException e
			
        }catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("null Exception");
		}
		System.out.println("Finished");
	}
}