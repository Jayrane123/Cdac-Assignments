//Q4:  Write a program to find whether a given number is  divisible by 3  without using the modulus (  %  ) or division (  /  ) operators. 
//Hint  : Use  subtraction and bitwise shifts 
import java.util.Scanner;

public class Q4 {
    static boolean isDivisibleBy3(int num) {
        num =Math.abs(num); 
        
        if (num == 0 || num == 3 || num == 6 || num == 9) 
            return true;
        if (num < 10) 
            return false;

       
        int sum = 0;
        while (num > 0) {
            sum = sum - (~(num & 1) + 1) - (~((num >> 1) & 1) + 1); 
            num = num >> 2; 
        }

        
        return isDivisibleBy3(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
       
        if (isDivisibleBy3(num)) {
            System.out.println(num + " is divisible by 3.");
        } else {
            System.out.println(num + " is NOT divisible by 3.");
        }
        
        scanner.close();
    }
}
