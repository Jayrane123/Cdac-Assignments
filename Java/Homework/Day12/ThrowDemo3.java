class ThrowDemo3{
	static void m3(){
		System.out.println("3");
		int i=1/0;//Exception
	}
	static void m2(){
		System.out.println("2");
		m3();
	}
	static void m1(){
		System.out.println("1");
		m2();
	}
	static void m(){
		System.out.println("0");
		m1();
	}
	public static void main(String args[]){
		System.out.println("Started");
		m();
	}
}