//Q10:  Write a program to determine if a  character is a vowel  or a consonant using the ternary operator. 
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); 

        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        ? "Vowel" : "Consonant";

        System.out.println(ch + " is a " + result);

        scanner.close();
    }
}
