
ASSIGNMENT 2                                               18/02/25

------------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 1: 
public class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
 What error do you get when running this code?


Ans :  // Error: main method must be static



/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/


-------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 2: 
public class Main { 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
 What happens when you compile and run this code?


Ans : // Error: main method must be public

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 3: 
public class Main { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 } 
} 
 What error do you encounter? Why is void used in the main method?

Ans : // Error: main method must return void
      // -- Because the JVM does not recognize a main method with a non-void return type as the valid entry point.




/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/

-------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 4: 
public class Main { 
 public static void main() { 
 System.out.println("Hello, World!"); 
 } 
} 
 What happens when you compile and run this code? Why is String[] args needed?


Ans : // Error: JVM requires main(String[] args)
   /*  -- 1 - Accepts Input from the Command Line
        2 - Standard JVM Convention
        3 - Allows Dynamic Input Without User Interaction*/

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}*/



------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 5: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
 Can you have multiple main methods? What do you observe?



Ans :  // Works: JVM only calls main(String[] args)



/*public class Main {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args");
    }
    public static void main(int[] args) {
        System.out.println("Overloaded main method with int[] args");
    }
}
*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 6: 
public class Main { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} 
 What error occurs? Why must variables be declared?


Ans :
/*Error: cannot find symbol
  symbol:   variable y
  location: class Main
*/

// public class Main { 
//     public static void main(String[] args) { 
//     int y =2;
//     int x = y + 10; 
//     System.out.println(x); 
//     } 
//    }

/* 1-Ensure type safety: The compiler needs to know the type of data that a variable will store (e.g., int, String, double) to avoid mismatches in operations (e.g., trying to add a String to an int).
2- Allocate memory: Declaring a variable informs the program to allocate the correct amount of memory for storing its value.
3-Prevent errors: Declaring variables beforehand ensures that you are using them correctly, avoiding runtime errors related to undefined variables.*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 7: 
public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } 
} 
 What compilation error do you see? Why does Java enforce type safety?


Ans : // Error: String cannot be converted to int

/*public class Main {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(x);
    }
}
*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 8: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!" 
 } 
} 
 What syntax errors are present? How do they affect compilation?

Ans : // Error: Missing closing parenthesis

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 9: 
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 
 What error occurs? Why can't reserved keywords be used as identifiers?

Ans : // Error: 'class' is a reserved keyword


/*public class Main {
    public static void main(String[] args) {
        int myClass = 10;
        System.out.println(myClass);
    }
}*/





--------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 10: 
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 
 What happens when you compile and run this code? Is method overloading allowed?

Ans : // Error: Non-static method cannot be called in static context


/*public class Main {
    public void display() {
        System.out.println("No parameters");
    }
    public void display(int num) {
        System.out.println("With parameter: " + num);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
        obj.display(5);
    }
}

*/

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Snippet 11: 
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 
 What runtime exception do you encounter? Why does it occur?


Ans :

// Error: java.lang.ArrayIndexOutOfBoundsException
// Explanation: The array has only three elements (indices 0, 1, 2), so accessing index 5 causes an out-of-bounds exception.



/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[1]);
    }
}
*/






-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
} 
 What happens when you run this code? How can you avoid infinite loops?


Ans :

// Output: The program enters an infinite loop and continuously prints "Infinite Loop".
// How to avoid: Use a condition that eventually becomes false, such as a counter or a user input break statement.


/*public class Main {
    public static void main(String[] args) {
        while (false) {
            System.out.println("Infinite Loop");
        }
            System.out.println("Infinite Loop");
    }
}
*/


---------------------------------------------------------------------------- -----------------------------------------------------------------------------------------

Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} 
 What exception is thrown? Why does it occur?


Ans:

/*public class Main {
    public static void main(String[] args) {
        String str = null;
        if (str != null) {
            System.out.println(str.length());
        } else {
            System.out.println("String is null, cannot get length.");
        }
        System.out.println(str.length());
    }
}

*/
// Error: java.lang.NullPointerException
// The variable 'str' is assigned a null value, so calling length() on it leads to a NullPointerException.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 14: 
public class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} 
 What compilation error occurs? Why does Java enforce data type constraints?

Ans :
/*public class Main {
    public static void main(String[] args) {
        String num = "Hello" ;
        System.out.println(num);
    }
}*/



// Error: Type mismatch - incompatible types: String cannot be converted to double
// Java is a statically-typed language, meaning each variable must have a predefined type. Attempting to assign a String value to a double variable violates type constraints.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 
 What error occurs when compiling this code? How should you handle different data types 
in operations?


Ans :



// type mismatch error
// 1- Explicit Type Casting , 2- Use Compatible data type


/*public class Main { 
    public static void main(String[] args) { 
        double num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; // Store the result in a double variable
        System.out.println(result); // Output will be 15.5
    } 
}
*/


----------------------------------------------------------------------------------------------------------------------------------------------------------------------



Snippet 16: 
public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 
 What is the result of this operation? Is the output what you expected?


Ans :

//The result of the operation in this code is 2.0, but this might not be whati I expected

// REASON :

/*public class Main {
    public static void main(String[] args) {
        int num = 10;
        double result = num / 4.0; // Use 4.0 instead of 4 to enforce floating-point division
        System.out.println(result);
    }
}
*/

----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java?

Ans :

// Error: Compilation error - "**" is not a valid operator in Java
// Java does not support the exponentiation operator (**). Instead, use Math.pow(a, b) for exponentiation.


/*public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = a * b;
        System.out.println(result);
    }
}
*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
 What is the output of this code? How does operator precedence affect the result?

Ans :

//The output of this code is 20. This result is determined by the operator precedence rules in Java.




// If operator precedence were ignored and the expression were evaluated left-to-right, the result would be different:

//Incorrect evaluation: a + b would be 10 + 5 = 15, then 15 * 2 = 30.

//However, because of operator precedence, the multiplication is performed first, leading to the correct result of 20.


//Operator precedence determines the order in which operations are evaluated in an expression.

//In Java, multiplication (*) and division (/) have higher precedence than addition (+) and subtraction (-).


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java?



Ans :


/*public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }
}*/
// Error: java.lang.ArithmeticException: / by zero
// In Java, dividing an integer by zero causes an ArithmeticException at runtime.


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 20: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} 
 What syntax error occurs? How does the missing semicolon affect compilation?


Ans :

//The syntax error in this code is a missing semicolon (;) at the end of the System.out.println statement.

// In Java, every statement must end with a semicolon (;). The semicolon //acts as a delimiter, signaling the end of a statement. When the //semicolon is missing, the Java compiler cannot determine where the //statement ends, leading to a compilation error.


/*public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World"); // Semicolon added
    } 
}
*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 21: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 
 What does the compiler say about mismatched braces?


Ans :

// This error occurs because the compiler expects a closing brace } to //match the opening brace { for the main method and class. Without it, the //program's structure is incomplete, and the compiler cannot properly //interpret the code.



/*public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } // closing brace for main method
} // closing brace for class

*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
 What syntax error occurs? Can a method be declared inside another method?




Ans :

// The syntax error in this code is that the displayMessage method is //declared inside the main method. In Java, methods cannot be nested //inside other methods.




// Java does not allow methods to be defined within other methods. 


/*public class Main { 
    // Declare the method at the class level
    static void displayMessage() { 
        System.out.println("Message"); 
    } 

    public static void main(String[] args) { 
        // Call the method from main
        displayMessage(); 
    } 
}*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 23: 
public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case?



Ans:

//the issue is caused by the absence of break statements in the //switch cases.




// To prevent the program from executing the default case (or any other //unintended cases), you need to add a break statement at the end of each //case. The break //statement terminates the switch block, preventing //fall-through.





/*public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break; // Add break
            case 2: 
                System.out.println("Value is 2"); 
                break; // Add break
            case 3: 
                System.out.println("Value is 3"); 
                break; // Add break
            default: 
                System.out.println("Default case"); 
                break; // Optional break for default
        } 
    } 
}
*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Snippet 24: 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 




Ans :

//The code prints "Level 1", "Level 2", "Level 3", and "Unknown level" //because the break statements are missing in the switch block.

//Explanation:
//In a switch statement, the break statement is used to terminate the //current case and exit the switch block. Without the break statement, //Java will continue to execute all subsequent case blocks, even if the //condition for the case has already been satisfied. This behavior is //called "fall-through."

//Here's how the flow works when level is 1:

/*The switch(level) starts and checks the case 1: block.
It matches case 1:, so it executes System.out.println("Level 1").
Since there is no break after case 1:, the execution continues to case 2:, and System.out.println("Level 2") is printed.
The same happens for case 3: and default:, printing "Level 3" and "Unknown level" respectively.
This occurs because of the missing break statements after each case. Java continues to "fall through" each subsequent case and executes their corresponding statements.*/







public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break; // Add break to prevent fall-through
            case 2: 
                System.out.println("Level 2"); 
                break; 
            case 3: 
                System.out.println("Level 3"); 
                break; 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}








-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?


Ans:



// The code does not compile because switch statements in Java only //support certain types for the expression like byte, short, char, //int,string, enum, var, Character, Integer, Long.


// Error: incompatible types: possible lossy conversion from double to //int

//To fix the error:

// 1- Change the double to an int (or another compatible type like char).
//2 - Use an if-else block instead of a switch since if-else can handle floating-point numbers.




/*public class Switch { 
    public static void main(String[] args) { 
        int score = 85; // Changed to int
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}
   





*/




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Snippet 26: 
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
 Error to Investigate: Why does the compiler complain about duplicate case labels? What 
happens when you have two identical case labels in the same switch block? 



Ans:

// The compiler will complain about the duplicate case labels because, //in a switch statement, each case label must be unique.

//  You cannot have two case labels with the same value within the same //switch block. When you do, it leads to ambiguity, and the compiler //cannot decide which block of code should be executed.








/*public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 6: // Changed the case label to a different value
                System.out.println("This is another case 6"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}


*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------