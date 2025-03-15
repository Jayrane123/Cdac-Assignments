class Animal{
	
	Animal(){
		System.out.println("Animal class Default Constructor");
	}
}


class Dog extends Animal{
	
	Dog(String name){
		System.out.println("Dog class Default Constructor");
		System.out.println("Dog name is :"+name);
	}
}





class C2{
	public static void main(String args[]){
		Animal a=new Animal();
		Animal b=new Dog("LEO");
		Dog d=new Dog("LEO");
		
	}	
}
