import java.util.Scanner;
class MultiSub{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Row lenght");
		int r=sc.nextInt();
		System.out.println("Enter Column lenght");
		int k=sc.nextInt();
		int [][]a =new int[r][k];
		int [][]b=new int[r][k];
		int [][]ab=new int[r][k];
		System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
		System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("b[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < k; j++) {
                
                ab[i][j] =a[i][j]-b[i][j];
				
				
            }
        }
		for (int[] row : ab) { 
            for (int value : row) { 
                System.out.print(value + " ");
            }
            System.out.println(); 
        }
		
		
	}
}