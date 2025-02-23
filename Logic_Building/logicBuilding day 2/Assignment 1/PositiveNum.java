/*Check Positive Number: 
 Task: Create a flowchart to check whether a number is positive. 
 Next Step: Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message.*/

class PositiveNum {
    public static void main(String[] args) {       
        int num = 10;         
        
        if (num > 0) {
            System.out.println("The number "+ num + " is positive.");
        } else {
            System.out.println("The number"+ num + " is not positive.");
        }
    }
}
