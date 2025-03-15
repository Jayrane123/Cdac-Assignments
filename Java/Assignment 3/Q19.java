 // Transpose of a Matrix 
// ○  Given a matrix, return its transpose (swap rows and columns). 
import java.util.Scanner;
class Q19 {
	public static void transpose(int [][]a,int r,int k){
		for (int i = 0; i < r; i++) {
            for (int j = i; j < k; j++) {
                int temp =a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
            }
        }

		System.out.println("Element After Transpose: ");
		for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
	}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row length");
        int r = sc.nextInt();
        System.out.println("Enter Column length");
        int k = sc.nextInt();
        int[][] a = new int[r][k];

        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = sc.nextInt();
            }
        }
		System.out.println("Element before Swapping:");
        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
		transpose(a,r,k);
		
        sc.close();
    }
}
