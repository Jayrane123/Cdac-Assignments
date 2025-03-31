// class Recursion{
	// static void show(){
		// System.out.println("Hii Gyes.............");
		// show();
	// }
	// public static void main(String []args){
		// show();
	// }
// }

class Recursion{
	static int i=0;
	static void show(){
		i++;
		if(i<=5){
			System.out.println("Hii Gyes.............");
		    show();
		}
		
	}
	public static void main(String []args){
		show();
	}
}