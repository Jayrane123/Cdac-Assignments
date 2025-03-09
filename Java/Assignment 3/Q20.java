import java.util.Scanner;
class Q20{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Row lenght");
		int r=sc.nextInt();
		
		int [][]a =new int[r][r];
		int [][]b=new int[r][r];
		int [][]ab=new int[r][r];
		System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
		System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("b[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }
		for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                
                ab[i][j] =a[i][j]+b[i][j];
				
				
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