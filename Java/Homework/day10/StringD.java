class StringD{
	public static void main(String args[]){
		String s1="ABC";//String literal-->in string pool
		String s2="ABC";//String literal-->in string pool
		String s3="ABCD";//String literal-->in string pool
		String s4="ABCD";//String literal-->in string pool
		
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//true
		
		String s5=new String("ABC");
		System.out.println(s5==s1);//false
		System.out.println(s5.equals(s1));//true
		s1=s1.concat(("XYX"));
		System.out.println(s1);
		s2=s1.concat(("XYX"));
		System.out.println(s2);
		System.out.println(s5==s1);
		
	}
}