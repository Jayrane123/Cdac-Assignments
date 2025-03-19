
abstract class Shape{
	protected String shapeName;
	final double pi = 3.14; 
	
	Shape(String shapeName){
		this.shapeName=shapeName;
	}
	String getShapeName(){
		return shapeName;
	}
	abstract void calculateArea();
}
class Circle extends Shape{
	private double radius;
	
	Circle(double radius ){
		super("Circle");
		this.radius=radius;
	}
	void calculateArea(){
		double area =pi*radius*radius;
		System.out.println("Shape: " + getShapeName() + ", Area: "+area);
	}
}
class Rectangle extends Shape{
	private double length;
	private double width;
	
	Rectangle(double length,double width){
		super("Rectangle");
		this.width=width;
		this.length=length;
	}
	void calculateArea(){
		double area =length*width;
		System.out.println("Shape: " + getShapeName() + ", Area: "+area);
	}
}

class Q1{
	public static void main(String []args){
		Shape r=new Rectangle(4,8);
		r.calculateArea();
		Shape c = new Circle(5);
        c.calculateArea();
		
	}
	
}