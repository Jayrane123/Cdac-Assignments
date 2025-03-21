package Assignment4;

public class Box {
	private double height, width, breadth;
	Box(double height,double width, double breadth){
		this.breadth=breadth;
		this.height=height;
		this.width=width;
	}
	double getVolume() {
		return breadth * width * height;
	}
	double  getArea() {
		return 2 * (breadth * width + width * height + height * breadth) ;
	}
	void getDisplay() {
		System.out.println("Box Dimensions: " + breadth + " x " + width + " x " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface Area: " + getArea());
	}
	public static void main(String[] args) {
		Box b1=new Box(3,5,5.6);
		Box b2=new Box(3.8,4.,6);
		System.out.println("**** Box 1 Details ****");
		b1.getDisplay();
		System.out.println("\n**** Box 2 Details ****");
		b2.getDisplay();

	}

}
