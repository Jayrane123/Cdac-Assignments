/*Print Area of a Rectangle: 
 Task: Create a flowchart to calculate and print the area of a rectangle. 
 Next Step: Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width. */


import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the Rectangle: ");
        int len = scanner.nextInt();
        System.out.print("Enter the width of the Rectangle: ");
        int wid = scanner.nextInt();
        
        int area = len * wid;
        
        System.out.println("The area of the Renctangle is: " + area);
        
        scanner.close();
    }
}
