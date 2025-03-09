//Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
//Hint  :  n & (n - 1) == 0  for positive numbers. 
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean isPowerOf2 = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is " + (isPowerOf2 ? "a Power of 2" : "NOT a Power of 2"));

        scanner.close();
    }
}