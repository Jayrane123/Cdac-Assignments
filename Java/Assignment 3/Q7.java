// 7.  Rotate an Array 
// ○  Rotate the array to the right by k positions.

import java.util.Scanner;

class Q7 {
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
		int a[]=new int[n];
		System.out.println("Which position you want to rotate an aray");
        int k = sc.nextInt();
		int j=0;
		for(int i=k-1;i<n;i++){
			a[j]=arr[i];
			j++;
		}
		for(int i=0;i<k-1;i++){
			a[j]=arr[i];
			j++;
		}

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
