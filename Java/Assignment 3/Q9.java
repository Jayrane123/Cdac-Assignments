// 9.  Find Missing Number in an Array 
// ○  Given an array of size n-1 containing numbers from 1 to n, find the missing number
import java.util.Scanner;

class  Q9 {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int[] arr = new int[n - 1]; 

        System.out.println("Enter " + (n - 1) + " elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);

        sc.close();
    }
}
