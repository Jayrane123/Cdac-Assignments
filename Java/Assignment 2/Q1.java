//Q1:  Write a program to swap two numbers  without using a third variable  and without using arithmetic operators like  +  or  -
import java.util.Scanner;
class Q1{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("1st Num:");
		int n1 = sc.nextInt();
		System.out.println("2nd Num:");
		int n2 = sc.nextInt();
		System.out.println("1st num is"+ n1 +"2nd num is "+n2);
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println("1st num is"+ n1 +"2nd num is "+n2);	
		
	}
}