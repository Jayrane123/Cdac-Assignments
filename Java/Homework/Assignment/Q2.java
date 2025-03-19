interface Photosynthesis{
	void absorbSunlight();
	
}
interface Respiration{
	void releaseOxygen();
}
class Plant implements Photosynthesis,Respiration{
	private String plantName;
	Plant(String name){
		this.plantName=name;
	}
	String getPlantName(){
		return plantName;
	}
	public void absorbSunlight(){
		System.out.println("Plant is absorbing sunlight for photosynthesis.");
	}
	public void releaseOxygen(){
		System.out.println("Plant is releasing oxygen through respiration.");
	}
}
class Q2{
	public static void main(String []args){
		Plant a=new Plant("Mango Tree");
		System.out.println("Plant Name: " + a.getPlantName());
		a.absorbSunlight();
		a.releaseOxygen();
		Plant b=new Plant("Fern");
		System.out.println("Plant Name: " + b.getPlantName());
		b.absorbSunlight();
		b.releaseOxygen();
	}
}