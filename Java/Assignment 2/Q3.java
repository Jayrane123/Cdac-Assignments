 //Implement a program that calculates the  sum of digits  of an integer using  modulus (  %  ) and division (  /  ) operators  . 
import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Input Num:");
		int n = sc.nextInt();
		int sum =0;
		while (n != 0){
			int last = n % 10;
		    sum += last;
			n /= 10;
		}
		System.out.println("sum of digits is : "+sum);
		int a=10;
		System.out.println(a++);
		
		
	}
}