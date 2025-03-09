//Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a number using bitwise operations. 
//Hint  : Use  n & (n - 1) 
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;
        while (num > 0) {
            num = num & (num - 1);
            count++;
        }

        System.out.println("Number of 1s in binary representation: " + count);

        scanner.close();
    }
}
