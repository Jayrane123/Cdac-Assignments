import java.util.Scanner;
class MatDiv {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row length");
        int r = sc.nextInt();
        System.out.println("Enter Column length");
        int k = sc.nextInt();
        int[][] a = new int[r][k];
        int[][] b = new int[k][r];
        int[][] ab = new int[r][r];

        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < r; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                for (int f = 0; f < k; f++) {
                    ab[i][j] += a[i][f] / b[f][j];
                }
            }
        }

        for (int[] row : ab) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
