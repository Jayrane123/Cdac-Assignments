//Q25:  Implement a program that reverses an  integer number  without using string conversion (  StringBuilder  or  toCharArray  ). 
//Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; } 

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;  
            num /= 10;  
        }

        System.out.println("Reversed Number: " + rev);
        sc.close();
    }
}
