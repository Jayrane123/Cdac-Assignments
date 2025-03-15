class A{
 void show(){
	 System.out.println("class A");
 }
}
class B extends A{
	void show(){
		System.out.println("class B");
	}
}
class C extends B{
	void show(){
		System.out.println("class C");
	}
}
class Downcast{
	public static void main(String args[]){
		
		// A a =new B();
		// B c=(B) a;//upcast
		// c.show();//downcast
		
		
		// A a1 =new A();
		// B c1=(B) a1;//upcast
		// c1.show();//downcast
		//Exception in thread "main" java.lang.ClassCastException: class A cannot be cast to class B (A and B are in unnamed module of loader 'app')
		
		// A a2=new B();
		// if(a2 instanceof B){
			// B c2=(B) a2;
			// c2.show();
		// }else{
			// System.out.println("Downcasting not possible");
		// }
		// if(c2 instanceof C){
			// C c3=(C) a2;
			// c3.show();
		// }else{
			// System.out.println("Downcasting not possible");
		// }
		
		
		// A a3 =new A();
		// if(a3 instanceof B){
			// B c3=(B) a3;
			// c3.show();
		// }else{
			// System.out.println("Downcasting not possible");
		// }
		//=========>Downcasting not possible
		
		
		//**************check***********
		A a = new C(); // A reference to an object of C
        B b = (B) a; // Downcasting to B
        C c = (C) a; // Downcasting to C
        c.show(); // Outputs: "class C"

        //Using instanceof to prevent ClassCastException
        A a2 = new B();
        if (a2 instanceof C) {
            C c2 = (C) a2;
            c2.show();
        } else {
            System.out.println("Downcasting not possible"); // This will execute
        }
		
		}
	
}