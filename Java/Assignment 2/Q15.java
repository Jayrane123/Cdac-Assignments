//Q15:  Implement a program to swap  odd and even bits  of a number using bitwise operators. 
//Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int result = ((x & 0xAAAAAAAA) >> 1) | ((x & 0x55555555) << 1);

        System.out.println("After swapping odd and even bits: " + result);

        scanner.close();
    }
}
