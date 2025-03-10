// 6.  Remove Duplicates from a Sorted Array 
// ○  Remove duplicate elements from a sorted array without using extra space.

import java.util.Scanner;

class Q6 {
	static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) return n;

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
		if(arr.length <1){
			System.out.println("No element in array");
            return;
		}
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        int newSize = removeDuplicates(arr,n);
        for(int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
		
    }
}
