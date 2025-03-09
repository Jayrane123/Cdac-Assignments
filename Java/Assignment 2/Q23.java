//Q23:  Given a number, find whether it is  odd or even  using the  &  bitwise operator and print the result without using  if-else 
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String result = (num & 1) == 0 ? "Even" : "Odd"; // Using bitwise AND
        System.out.println(result);
        
        sc.close();
    }
}
