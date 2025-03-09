//Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using logical (  &&  ,  ||  ) operators  . 
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

        System.out.println(year + (isLeap ? " is a Leap Year." : " is NOT a Leap Year."));

        scanner.close();
    }
}
