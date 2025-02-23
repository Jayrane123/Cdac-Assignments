/* Question 3: Calculator 
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message. */


    import java.util.Scanner;
    class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.close();
        switch(op) {
            case '+': System.out.println("Result: " + (num1 + num2)); break;
            case '-': System.out.println("Result: " + (num1 - num2)); break;
            case '*': System.out.println("Result: " + (num1 * num2)); break;
            case '/': 
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Error: Division by zero");
                break;
            default: System.out.println("Invalid operator");
        }
    }
}
