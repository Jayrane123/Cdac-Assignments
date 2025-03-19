class WrapperDemo{
	public static void main(String args[]){
		int a=20;//premitive data
		long l=20L;//premitive data
		Integer a1=new Integer(34);
		//Integer l1=new Integer("abc");
		//AUTOBOXING----->primitive to Wrapper class
		Integer i=Integer.valueOf(a);//Explicit conversion
		Long i1=Long.valueOf(l);//Explicit conversion ====>AUTO BOXING
		
		Integer j=a;
		System.out.println(j);
		
	}
}