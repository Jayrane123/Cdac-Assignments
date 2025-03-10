interface A{
	default void print(){
		System.out.println("Class A");
	}
}
interface B extends A{
	default void print(){
		System.out.println("class B");
		
	}
}
interface C extends A{
	default void print(){
		System.out.println("class C");
		
	}
}
class D implements B,C{
	public void print(){
		System.out.println("class D");
		
	}
}

class Multiple{
	public static void main(String args[]){
		C a=new D();
		a.print();
	}
}
