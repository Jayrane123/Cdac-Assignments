class Animal{
	
	Animal(String name){
		System.out.println("Animal Name : "+ name);
	}
}


class Dog extends Animal{
	
	Dog(){
		super("Dog");
		System.out.println("Dog class Default Constructor");
		
	}
}





class C3{
	public static void main(String args[]){
		Animal a=new Animal("Dog");
		Animal b=new Dog();
		Dog d=new Dog();
		
	}	
}
