abstract class Vehicle{
	abstract void tyre(int num);
	void display(){
		System.out.println("Vehicle data....");
	}
}
class Bike extends Vehicle{
	int tyre =0;
	int p =0;
	void tyre(int tyre){
		this.tyre=tyre;
		System.out.println("Bike has : "+tyre +"tyre");
		
	}
	void BikePrize(int p){
		this.p=p;
		System.out.println("Bike Prize is : "+p);
	}
	static void Avg(){
		System.out.println("Avg of Bike is 70km/hr.");
	}
}
class VehicleData{
	public static void main(String args[]){
		Vehicle b=new Bike();
		Bike c=new Bike();
		b.tyre(1000);
		c.tyre(1000);
		b.display();
		c.Avg();
	}
}