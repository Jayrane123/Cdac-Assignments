// 8.  Merge Two Sorted Arrays 
// ○  Merge two sorted arrays into a single sorted array without using extra space.
import java.util.Scanner;

class Q8 {
    public static void mergeSorted(int[] arr1, int[] arr2, int n, int m) {
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

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        mergeSorted(arr1, arr2, n, m);

        for (int num : arr1) System.out.print(num + " ");
        for (int num : arr2) System.out.print(num + " ");

        sc.close();
    }
}
