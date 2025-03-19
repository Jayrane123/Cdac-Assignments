import java.io.*;
class ChDemo3{
	public static void main(String args[])throws IOException{
		m1();
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