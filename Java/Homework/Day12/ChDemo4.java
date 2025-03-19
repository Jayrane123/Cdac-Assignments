import java.io.*;
class ChDemo4{
	public static void main(String args[]){
		try{
		m1();
		}catch(IOException e){
			System.out.println("IO");
		}
	}
	static void m1()throws IOException{
		System.out.println("1");
		m2();
	}
	static void m2()throws IOException{
		System.out.println("Enter any character");
		int j=System.in.read();
		System.out.println("character is "+ (char)j);
		System.out.println("2");
	}
	
}