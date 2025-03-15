class P{
	int i=0;
	void show(){
		System.out.println("parent");
	}
	void show1(){
		System.out.println("parent");
	}
}
class C extends P{
	//super.show()// error: illegal start of type
	show1();
	void show(){
		super.show();//error
		super.show1();//error
		System.out.println(i);//not give error but if i also declare then we have to use super.i
		System.out.println(super.i);//not give error but if i also declare then we have to use super.i
		System.out.println("Child");
	}
}
class Super{
	public static void main(String args[]){
		C a=new C();
		a.show();
	}
}