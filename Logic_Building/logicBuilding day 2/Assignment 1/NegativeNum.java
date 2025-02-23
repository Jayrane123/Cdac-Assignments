/*Check Negative Number: 
 Task: Create a flowchart to check whether a number is negative.  
 Next Step: Write a Java program that checks if a predefined number is negative using an 
if-else statement and displays the result. */

class NegativeNum {
    public static void main(String[] args) {
        int num = 10;  
        if (num < 0) {
            System.out.println("The number "+ num + " is Negative.");
        } else {
            System.out.println("The number "+ num + " is not Negative.");
        }
    }
}
