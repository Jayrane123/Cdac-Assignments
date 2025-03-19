class WrapperDemo1{
	public static void main(String args[]){
		// UnBoxing
		Integer a=new Integer(34);
		// method 1
		int j=a;//automaticCOnersion
		System.out.println(j);
		// method 2
		int i=a.intValue();//explicit call obj->primitive
		
		System.out.println(j);
	}
}