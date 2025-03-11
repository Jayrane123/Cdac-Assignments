// 12.  Write a program to accept 20 integer numbers in a single Dimensional Array. Find and 
// Display the following: 
// ○  Number of even numbers. 
// ○  Number of odd numbers. 
// ○  Number of multiples of 3 

import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int evenCount = 0, oddCount = 0, multipleOf3Count = 0;

        System.out.println("Enter 20 integer numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            if (arr[i] % 3 == 0) {
                multipleOf3Count++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);
    }
}
