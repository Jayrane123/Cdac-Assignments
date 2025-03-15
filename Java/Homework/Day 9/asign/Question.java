class Flower{
	String name;
	String color;
	boolean hasFragrance;
	Flower(String name,String color,boolean hasFragrance){
		this.name=name;
		this.color=color;
		this.hasFragrance=hasFragrance;
	}
	void Display(){
		System.out.println("Name of FLower is "+this.name);
		System.out.println("Colour of "+this.name+" is "+this.color);
		System.out.println(this.name+" hasFragrance "+this.hasFragrance);
	}
}
class Rose extends Flower{
	boolean hasThorns;
	Rose(String color,boolean hasFragrance,boolean hasThorns){
		super("Rose",color,hasFragrance);
		this.hasThorns=hasThorns;
	}
	
	void Display(){		
		super.Display();
		System.out.println(this.name+" hasThorns "+this.hasThorns);
		System.out.println();
		
	}
	
}
class Lily extends Flower{
	boolean isWaterPlant;
	Lily(String color,boolean hasFragrance,boolean isWaterPlant){		
		super("Lily",color,hasFragrance);
		this.isWaterPlant=isWaterPlant;
	}
	void Display(){
		super.Display();
		System.out.println(this.name+" isWaterPlant "+this.isWaterPlant);
		System.out.println();
}
	}
	
class Question{
	public static void main(String args[]){
		Rose r=new Rose("red",true,true);
		System.out.println("***********Flower************");
		r.Display();
		System.out.println("***********Flower************");
		Lily l=new Lily("white",true,true);
		l.Display();
	}
}