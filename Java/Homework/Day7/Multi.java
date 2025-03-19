interface A{
	default void print(){
		System.out.println("Class A");
	}
}
interface B {
	default void print1(){
		System.out.println("class B");
		
	}
}
interface C extends A,B{
	default void print3(){
		System.out.println("class C");
		
	}
}
class D implements C{
	public void print(){
		System.out.println("class D");
		
	}
}

class Multi{
	public static void main(String args[]){
		C a=new D();
		a.print();
	}
}
