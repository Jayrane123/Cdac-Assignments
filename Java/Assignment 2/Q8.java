//Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of them are  true  . 
//Hint  : Use logical operators (  &&  ,  || 

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first boolean (true/false): ");
        boolean a = scanner.nextBoolean();

        System.out.print("Enter second boolean (true/false): ");
        boolean b = scanner.nextBoolean();

        System.out.print("Enter third boolean (true/false): ");
        boolean c = scanner.nextBoolean();

       
        boolean result = (a && b) || (b && c) || (a && c);

        System.out.println("At least two are true: " + result);

        scanner.close();
    }
}
