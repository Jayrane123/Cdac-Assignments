class A{
	//A a1=new A(); //error: cannot find symbol
	InstanceOfDemo op;
}
class B extends A{
	
}
class InstanceOfDemo{
	public static void main(String args[]){
		InstanceOfDemo op=new InstanceOfDemo();
		A a1=new A();
		B b1=new B();
		System.out.println(op instanceof InstanceOfDemo);
		//System.out.println(op instanceof A);//error
		System.out.println(a1 instanceof A);
		System.out.println(b1 instanceof A);
		System.out.println(b1 instanceof B);
		System.out.println(a1 instanceof B);
	}
}