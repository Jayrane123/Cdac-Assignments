import java.util.Scanner;
class Q18 {
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

        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
