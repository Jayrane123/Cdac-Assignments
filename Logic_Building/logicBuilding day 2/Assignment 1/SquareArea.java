/*Print Area of a Square: 
 Task: Create a flowchart to calculate and print the area of a square.  
 Next Step: Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length.*/


import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();
        
        int area = side * side;
        
        System.out.println("The area of the square is: " + area);
        
        scanner.close();
    }
}
