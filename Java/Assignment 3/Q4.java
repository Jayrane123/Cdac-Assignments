// 4.  Count Even and Odd Numbers 
// ○  Count the number of even and odd numbers in an array.

import java.util.Scanner;

class Q4 {
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

        int even=0;
		int odd=0;
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even numbers in array is :"+even);
		System.out.println("odd numbers in array is :"+odd);
    }
}
