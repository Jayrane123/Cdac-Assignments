// 10.  Find Intersection and Union of Two Arrays 
// ○  Find the intersection and union of two unsorted arrays

import java.util.Scanner;
import java.util.Arrays;
class Q10{
    public static void interSectNum(int[] arr1, int[] arr2, int n, int m) {
        int intter[]=new int[n+m];
		System.arraycopy(arr1, 0, intter, 0, n);
		int count=n;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(arr2[i]!=arr1[j]){
					intter[count++]= arr2[i];
					break;
				}
			}
		}
		Arrays.sort(intter);
		System.out.println( "Array after Intersection");
		for (int num : intter) System.out.print(num + " ");
    }
	public static void unionNum(int[] arr1, int[] arr2, int n, int m) {
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
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
        int[] arr2 = new int[m];
		System.out.println( "array 2 val");
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        interSectNum(arr1, arr2, n, m);

        sc.close();
    }
}
