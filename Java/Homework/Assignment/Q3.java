class BMW{
	void showDetails(){
		System.out.println("This is BMW vehicle.");
	}
	void maxSpeed(){
		System.out.println("Speed varies by model.");
	}
}

class BMWSeries3 extends BMW{
	
	@Override
    void showDetails() {
        System.out.println("This is a BMW Series 3.");
    }

    @Override
    void maxSpeed() {
        System.out.println("BMW Series 3 speed is 240 km/h");
    }
}
class BMWSeries5 extends BMW{
	
	@Override
    void showDetails() {
        System.out.println("This is a BMW Series 5.");
    }

    @Override
    void maxSpeed() {
        System.out.println("BMW Series 5 speed is 260 km/h");
    }
}
class BMWSeries7 extends BMW{
	
	@Override
    void showDetails() {
        System.out.println("This is a BMW Series 7.");
    }

    @Override
    void maxSpeed() {
        System.out.println("BMW Series 7 speed is 300 km/h");
    }
}

class Q3{
	public static void main(String []args){
		BMW[] bmwCars = {
            new BMWSeries3(),
            new BMWSeries5(),
            new BMWSeries7()
        };
		for (BMW car : bmwCars) {
            car.showDetails();
            car.maxSpeed();
            System.out.println(); 
        }
	}
}