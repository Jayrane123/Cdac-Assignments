import java.util.Scanner;
import java.util.Arrays;
class Q8 {
    public static void mergeArr(int[] arr1, int[] arr2, int n, int m) {
        int i = n - 1, j = 0;
		int arr[]=new int[m+n];
		System.arraycopy(arr1, 0, arr, 0, n);
        System.arraycopy(arr2, 0, arr, n, m);
		System.out.println( "merge arr");
		for (int num : arr) System.out.print(num+" ");
        
        Arrays.sort(arr);
		System.out.println( "merge Sorted arr");
        for (int num : arr) System.out.print(num + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println( "array 1 length");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
		System.out.println( "array 1 val");  
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        System.out.println( "array 2 length");  
        int m = sc.nextInt();
		System.out.println( "array 2 val");  
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        mergeArr(arr1, arr2, n, m);
		
        
        
        sc.close();
    }
}




