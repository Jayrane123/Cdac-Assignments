//Q21:  Write a program that  increments a number without using  +  or  ++  operators. 
//Hint  : Use bitwise  - (~x) 
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        num = -~num; // Increment using ~ operator

        System.out.println("Incremented Value: " + num);
        sc.close();
    }
}

