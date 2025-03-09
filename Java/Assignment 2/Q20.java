//Q20:  Implement a Java program that  returns the absolute value  of a given number using the ternary operator (without using  Math.abs() 
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int abs = (num < 0) ? -num : num;
        System.out.println("Absolute Value: " + abs);
        sc.close();
    }
}
