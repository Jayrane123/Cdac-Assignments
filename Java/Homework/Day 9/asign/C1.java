class Animal{
	int id =5;
	Animal(){
		System.out.println("Animal class Default Constructor");
	}
}


class Dog extends Animal{
	int cid =4;
	Dog(){
		System.out.println("Dog class Default Constructor");
	}
}





class C1{
	public static void main(String args[]){
		Animal a=new Animal();
		Animal b=new Dog();
		Dog d=new Dog();
		
	}	
}
