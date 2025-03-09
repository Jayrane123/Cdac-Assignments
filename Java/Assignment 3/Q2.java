// 2.  Reverse an Array 
// ○  Reverse the given array in place. 

import java.util.Scanner;
class Q2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
        int r = sc.nextInt();
		int[] b = new int[r];
		int high=0;
		int low=0;
		System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
                b[i] = sc.nextInt();
        }
		int k = r - 1;
        for (int j = 0; j < r / 2; j++, k--) {
            int temp=0;			
			temp=b[j];
			b[j]=b[k];
			b[k]=temp;
		}
		for(int x:b){
			System.out.println(x+" ");
		}
		
	}
}