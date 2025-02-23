/* 4. Display Good Morning Message Based on Time: 
 Task: Create a flowchart to display a "Good Morning" message based on a given time. 
 Next Step: Write a Java program that displays a "Good Morning" message if the 
predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic. */

import java.util.Scanner;

public class MorningMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the time in hours (0-23): ");
        int time = scanner.nextInt();
        
        if (time >= 5 && time < 12) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("It's not morning.");
        }
        
        scanner.close();
    }
}
