// class Person{
	// private String name;
	// private int b;
	// Person(String name,int b){
		// this.name=name;
		// this.b=b;
	// }
// }
// class ToStringDemo{
	// public static void main(String args[]){
		// Person a=new Person("Jay",100);
		// Person b=new Person("Jay",100);
		
		// System.out.println(a==b);//false
		// System.out.println(a.equals(b));//false
		// System.out.println(a);//Person@hashcode
		// System.out.println(a);//Person@hashcode
		
		
		
	// }
// }
class Person{
	private String name;
	private int b;
	Person(String name,int b){
		this.name=name;
		this.b=b;
	}
	public String toString(){
		return name + " "+ b;
	}
	public boolean equals(Object obj){
		Person p=(Person)obj;
		return this.name.equals(p.name);
	}
}
class ToStringDemo{
	public static void main(String args[]){
		Person a=new Person("Jay",100);
		Person b=new Person("Jay",100);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		System.out.println(a);//Jay 100
		System.out.println(a);//Jay 100
		
		
		
	}
}