// *********************************************************ASSIGNMENT- 1



// 1. Print 'Hello' and Your Name
// Write a Java program to print 'Hello' on the screen and then print your name on a separate 
// line.

// ans :  

// class logicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//         // Scanner scanner = new Scanner(System.in); 
//     System.out.println("hii \nJay Rane");
//     }
// }


//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2. Sum of Two Numbers
// Write a Java program to print the sum of two numbers.
// Test Data: 74 + 36

// ans : 

// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//      System.out.println(74+36);
//     }
// }
     

//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 3. Divide Two Numbers
// Write a Java program to divide two numbers and print the result on the screen.
// Test Data: 50 / 3

// ans : 

// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//       System.out.println(50/3);
//     }
// }

//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
// 4. Perform Arithmetic Operations
// Write a Java program to print the result of the following operations.
// Test Data:
//              a. -5 + 8 * 6
//              b. (55 + 9) % 9
//              c. 20 + -3 * 5 / 8
//              d. 5 + 15 / 3 * 2 - 8 % 3

// ans : 

// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//       System.out.println(-5 + 8 * 6);
//       System.out.println(55 + 9 % 9);
//       System.out.println(20 + -3 * 5 / 8);
//       System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//     }
// }

//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 5. Multiply Two Numbers
// Write a Java program that takes two numbers as input and displays the product of the two 
// numbers.
// Test Data:
//            Input first number: 25
//            Input second number: 5

// ans : 

// import java.util.Scanner;
// class LogicBuildingClassAssignment1 { 
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); 
//         System.out.print("Input first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Input second number: ");
//         int num2 = scanner.nextInt();
//         System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//         //scanner.close(); 
//     }
// }
//  ----------------------------------------------------------------------------------------------------------------------------------------------------------------------


// 6. Basic Arithmetic Operations
// Write a Java program to print the sum, multiplication, subtraction, division, and remainder of 
// two numbers.
// Test Data:
//            Input first number: 125
//            Input second number: 24
// ans:

// import java.util.Scanner;
// class LogicBuildingClassAssignment1 { 
//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); 
//        System.out.print("Input first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Input second number: ");
//         int num2 = scanner.nextInt();
//         System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//         System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//         System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//         System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//         System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
//     }
// }
    
        

//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
// 7. Multiplication Table
// Write a Java program that takes a number as input and prints its multiplication table up to 
// 10.
// Test Data:
//            Input a number: 8

// ans : 
// import java.util.Scanner;
// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);  
//         System.out.print("Type Number: ");
//         int num = scanner.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }
//     }
// }


//  -------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 8. Swap Two Numbers
// Write a Java program to swap the values of two variables without using a third variable.
// Test Data: 
//           Input first number: 10
//           Input second number: 20

// ans :   
// import java.util.Scanner;
// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input first number: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Input second number: ");
//         int num2 = scanner.nextInt();
//         System.out.println("Before swapping: " + num1 + " " + num2);
//         num1 = num1 + num2;
//         num2 = num1 - num2;
//         num1 = num1 - num2;
//         System.out.println("After swapping: " + num1 + " " + num2);
//         scanner.close();
//     }
// }
    
//  -------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 9. Calculate the Area of a Circle
// Write a Java program that calculates the area of a circle.
// Test Data:
//            Input the radius: 7
//             Formula: Area = π * radius²

// ans :   
// import java.util.Scanner;
// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input radius: ");
//         double radius = scanner.nextDouble();
//         System.out.println("Area of the circle: " + (Math.PI * radius * radius));
//         scanner.close();
//     }
// }

//  ------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 10. Check If a Number Is Even or Odd
// Write a Java program that checks if a number is even or odd.
// Test Data:
//           - Input a number: 15

// ans :   
// import java.util.Scanner;
// class LogicBuildingClassAssignment1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input a number: ");
//         int num = scanner.nextInt();
//         System.out.println("The number " + num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
//         scanner.close();
//     }
// } 
         
//  -------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 11. Find the Largest of Three Numbers
// Write a Java program that takes three numbers as input and finds the largest of the three.
// Test Data:
//          - Input first number: 12
//          - Input second number: 45
//          - Input third number: 22

// ans :  

// import java.util.Scanner;

// class LogicBuildingClassAssignment1_Q11 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input first number: ");
//         int num1 = scanner.nextInt();
        
//         System.out.print("Input second number: ");
//         int num2 = scanner.nextInt();
        
//         System.out.print("Input third number: ");
//         int num3 = scanner.nextInt();
//         int largest = num1;
        
//         if (num2 > largest) {
//             largest = num2;
//         }
        
//         if (num3 > largest) {
//             largest = num3;
//         }

//         System.out.println("The largest number is: " + largest);

//         scanner.close();
//     }
// }
   

// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 12. Reverse a Number
// Write a Java program that takes a number as input and prints the reverse of that number.
// Test Data:
//            Input number: 12345

// ans :   
// import java.util.Scanner;

// class LogicBuildingClassAssignment1{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         int reversedNumber = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit; 
//             number = number / 10; 
//         }

//         System.out.println("Reversed Number: " + reversedNumber);
//         scanner.close();
//     }
// }


//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 13. Calculate the Average of Three Numbers
// Write a Java program to calculate the average of three numbers.
// Test Data:
//            Input first number: 20
//            Input second number: 40
//            Input third number: 60

// ans :  
// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input first number: ");
//         double num1 = scanner.nextDouble();
//         System.out.print("Input second number: ");
//         double num2 = scanner.nextDouble();
//         System.out.print("Input third number: ");
//         double num3 = scanner.nextDouble();

//         double average = (num1 + num2 + num3) / 3;
//         System.out.println("Average is: " + average);
//     }
// }



//  ---------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 14. Print the Fibonacci Series
// Write a Java program to print the Fibonacci series up to the 10th number.

// ans :  
// class LogicBuildingClassAssignment1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Input first number: ");
//         double num1 = scanner.nextDouble();
//         System.out.print("Input second number: ");
//         double num2 = scanner.nextDouble();
//         System.out.print("Input third number: ");
//         double num3 = scanner.nextDouble();

//         double average = (num1 + num2 + num3) / 3;
//         System.out.println("Average is: " + average);
//     }
// }

//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 15. Find the Factorial of a Number
// Write a Java program to find the factorial of a number.
// Test Data:
//            Input a number: 5

// ans :    

// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Input a number: ");
//             int number = scanner.nextInt();
//             long factorial = 1;
            
//             for (int i = 1; i <= number; i++) {
//                 factorial *= i;
//             }
            
//             System.out.println("Factorial of " + number + " is: " + factorial);
//         }
//     }        
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 16. Check Whether a Number Is Prime
// Write a Java program to check whether a number is prime or not.
// Test Data:
//            Input number: 17

// ans :    

// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Input number: ");
//             int num = scanner.nextInt();
//             boolean isPrime = true;
    
//             if (num <= 1) {
//                 isPrime = false;
//             } else {
//                 for (int i = 2; i <= Math.sqrt(num); i++) {
//                     if (num % i == 0) {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//             }
    
//             if (isPrime) {
//                 System.out.println(num + " is a prime number.");
//             } else {
//                 System.out.println(num + " is not a prime number.");
//             }
//         }
//     }

//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 17. Print the First N Natural Numbers
// Write a Java program to print the first N natural numbers, where N is provided by the user.
// Test Data:
//           - Input a number: 6

// ans :   
// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Input a number: ");
//             int N = scanner.nextInt();
            
//             for (int i = 1; i <= N; i++) {
//                 System.out.print(i + " ");
//             }
//         }
//     }

//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 18. Convert Celsius to Fahrenheit
// Write a Java program to convert a temperature from Celsius to Fahrenheit.
// Test Data:
//            Input temperature in Celsius: 25
//           Formula: Fahrenheit = (Celsius * 9/5) + 32

// ans :   
// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Enter temperature in Celsius: ");
//             double celsius = scanner.nextDouble();
//             double fahrenheit = (celsius * 9/5) + 32;
//             System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
//         }
//     }
        
//  -----------------------------------------------------------------------------------------------------------------------------------------------------------------

// 19. Calculate the Power of a Number
// Write a Java program that calculates the power of a number. Take two numbers as input: the 
// base and the exponent, and compute the result of base raised to the power of exponent.
// Test Data:
//            Input base number: 3
//            Input exponent number: 4

// ans :   
//import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Enter base number: ");
//             int base = scanner.nextInt();
//             System.out.print("Enter exponent number: ");
//             int expo = scanner.nextInt();
            
//             int result = 1;
//             for (int i = 1; i <= expo; i++) {
//                 result *= base;
//             }
            
//             System.out.println("Result: " + result);
//         }
//     }
        

//  -------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 20. Count the Number of Digits in a Number
// Write a Java program that counts the number of digits in a given number.
// Test Data:
//            Input number: 123456
           
// ans :   
// import java.util.Scanner;

// class LogicBuildingClassAssignment1{
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             System.out.print("Input number: ");
//             int number = scanner.nextInt();
//             int count = 0;
//             while (number != 0) {
//                 number /= 10;
//                 count++;
//             }
//             System.out.println("Number of digits: " + count);
//         }
//     }
    
// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------                           
