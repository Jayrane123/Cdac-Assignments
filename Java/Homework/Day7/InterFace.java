interface Bird{
	void sound();
	
	default void sleep() {
        System.out.println("Animal is sleeping...");
    }
	static void run() { 
        System.out.println("Animal is running...");
    }
}
class Dog implements Bird{
	public void sound(){
		System.out.println("Dog barks");
	}
	void eat(){
		System.out.println("food");
	}
}
class Parrot implements Bird{
	public void sound(){
		System.out.println("Parrot chirps");
	}
	void eat(){
		System.out.println("grass");
	}
}
class InterFace{
	public static void main(String args[]){
		Dog d=new Dog();
		Bird b=new Dog();		
		
		b.sleep();
		d.eat();
		d.sound();
	}
}