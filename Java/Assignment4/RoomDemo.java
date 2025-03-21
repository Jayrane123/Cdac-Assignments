package Assignment4;
class Room{
	private double height, width, breadth,v;
	Room(double height,double width,double breadth){
		this.height=height;
		this.breadth=breadth;
		this.width=width;
	}
	
	double volume() {		
		this.v=height*width*breadth;
		return v;
	}
}
public class RoomDemo {
    public static void main(String[] args) {
    	Room r=new Room(2, 3, 4);
    	Room r1=new Room(21, 32, 43);
    	System.out.println(r.volume());
    	System.out.println(r1.volume());
	}
}
