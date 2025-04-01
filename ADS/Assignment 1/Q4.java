// Problem 4: 
// Write a recursive program that performs the following operations: 
// 1. Check if a number is prime using recursion. 
// 2. Check whether a given string is a palindrome. 
// 3. Find the sum of digits of a given number. 
// 4. Calculate the nth Fibonacci number. 
// 5. Calculate a raised to the power b 
// Input: 
// num = 7  
// str = "racecar"   
// num = 1234   
// fibIndex = 6 
// a = 2, b = 5 
// Output: 
// Is prime: true 
// Is 'racecar' a palindrome? true   
// Sum of digits of 1234: 10   
// Fibonacci(6): 8 
// 2^5 = 32 
// Constraints: 
// ● Do not use loops or built-in reverse methods. 
// ● Use charAt() for string access. 
// ● You can assume valid positive integer inputs.

public class Q4 {
    static boolean isPrime(int n){
        if(n%2==0){
            return false;
        }
        return true;
    }
    static int digitSum(int num){
        int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10;       
        }
        return sum;
    }
    static int fibonacci(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int power(int n,int a){
        if (a == 1) return n;
        return n * power(n,a - 1);
    }
    static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        int a=8;
        int num = 1234;
        int a1 = 2, b = 5;
        String str = "racecar";
        System.out.println(isPrime(a));
        System.out.println(digitSum(num));
        System.out.println(fibonacci(6));
        System.out.println(power(a1,b));
        System.out.println(isPalindrome(str));
    }
}
