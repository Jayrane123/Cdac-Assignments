//Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 50)  without using  if-else 
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        System.out.println("Is number within range (20 to 50)? " + (num >= 20 && num <= 50));

        scanner.close();
    }
}
