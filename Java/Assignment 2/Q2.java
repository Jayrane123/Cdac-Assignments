// Write a program to check whether a given number is  even or odd  using only  bitwise operators  . 
import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Input Num:");
		int n = sc.nextInt();
		if((n&1)==1){
			System.out.println(n+" is odd");
		}else{
			System.out.println(n+" is even");
		}
		
		
	}
}