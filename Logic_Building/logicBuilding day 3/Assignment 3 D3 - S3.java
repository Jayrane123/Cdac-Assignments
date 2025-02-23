
ASSIGNMENT 3

SECTION 3: Lamborghini Exercise:                                                                                                             20/02/2025
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*


1. Write a program to calculate the sum of the first 50 natural numbers. 


ANS -
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Sum of the first 50 natural numbers: " + sum);
    }
}



*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

2. Write a program to compute the factorial of the number 10. 



ANS- public class Factorial {
    public static void main(String[] args) {
        int num = 10;
        long factorial = 1; 

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}


*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

3. Write a program to print all multiples of 7 between 1 and 100. 



ANS - public class MultiplesOfSeven {
    public static void main(String[] args) {
        System.out.println("Multiples of 7 between 1 and 100:");
        
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + " ");
        }
    }
}


*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

4. Write a program to reverse the digits of the number 1234. The output should be 4321. 


ANS -

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;  
            reversed = reversed * 10 + digit;  
            num /= 10;  
        }

        System.out.println("Reversed number: " + reversed);
    }
}

*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*
5. Write a program to print the Fibonacci sequence up to the number 21. 


ANS -
      public class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1; 
        System.out.print(a + " " + b + " "); 

        
        while (a + b <= 21) {
            int c = a + b; 
            System.out.print(c + " "); 
            a = b; 
            b = c; 
        }
    }
}

*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*

6. Write a program to find and print the first 5 prime numbers. 

ANS-

public class FirstFivePrimes {
    public static void main(String[] args) {
        int count = 0, num = 2;
        
        while (count < 5) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            
            num++;
        }
    }
}


*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
7. Write a program to calculate the sum of the digits of the number 9876. The output should be 
30 (9 + 8 + 7 + 6). 

ANS -

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 9876, sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}


*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*
8. Write a program to count down from 10 to 0, printing each number. 


ANS -

public class Countdown {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}


*/
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
9. Write a program to find and print the largest digit in the number 4825. 

ANS -
public class LargestDigit {
    public static void main(String[] args) {
        int num = 4825, maxDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num /= 10;
        }
        System.out.println(maxDigit);
    }
}

*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*
10. Write a program to print all even numbers between 1 and 50. 

ANS -
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
    }
}

*/

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

11. Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 

ANS -
public class PreIncrementPostDecrement {
    public static void main(String[] args) {
        int a = 5, result;
        result = ++a - a-- + a++;
        System.out.println(result);
    }
}

*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*

12. Write a program to draw the following pattern: 
***** 
***** 
***** 
***** 
***** 


ANS -

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

13. Write a program to print the following pattern: 
1 
2*2 
3*3*3 
4*4*4*4 
5*5*5*5*5 
5*5*5*5*5 
4*4*4*4 
3*3*3 
2*2

ANS -


public class NumberPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*


14. Write a program to print the following pattern: 
* 
** 
*** 
***** 
******* 
********* 

ANS -
public class StarPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

15. Write a program to print the following pattern: 
* 
** 
*** 
**** 
***** 


ANS -
public class RightTrianglePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

16. Write a program to print the following pattern: 
* 
*** 
***** 
******* 
*********

ANS -
public class PyramidPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

 
17. Write a program to print the following pattern: 
***** 
**** 
*** 
** 
* 


ANS -
public class InvertedRightTriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*

18. Write a program to print the following pattern: 
 * 
 *** 
 ***** 
 ******* 
 ***** 
 *** 
 * 


ANS -
public class HalfDiamondPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

19. Write a program to print the following pattern: 
1 
1*2 
1*2*3 
1*2*3*4 
1*2*3*4*5


ANS -
public class NumTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

20. Write a program to print the following pattern: 
5 
5*4 
5*4*3 
5*4*3*2 
5*4*3*2*1

ANS -
public class ReverseNumTriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
                if (j > i) System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/





-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9 




ANS -
public class OddNumberTriangle {
    public static void main(String[] args) {
        for (int i = 1, num = 1; i <= 5; i++, num += 2) {
            for (int j = 1, val = 1; j <= i; j++, val += 2) {
                System.out.print(val);
                if (j < i) System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

22. Write a program to print the following pattern: 
********* 
 ******* 
 ***** 
 *** 
 * 
 *** 
 ***** 
 ******* 
********* 

ANS -
public class DiamondPattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


/*


23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555 

ANS -
public class NumPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

*/





-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

24. Write a program to print the following pattern: 
1 
22 
333 
4444 
55555 


ANS -
public class NumPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

*/



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

25. Write a program to print the following pattern: 
1 
12 
123 
1234 
12345 




ANS -

public class NumPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

*/







-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



/*

26. Write a program to print the following pattern: 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15


ANS -

public class NumPattern {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}



*/




-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



