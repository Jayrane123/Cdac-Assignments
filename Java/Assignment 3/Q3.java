// 3.  Find the Second Largest Element 
// ○  Find the second-largest element in the given array. 

import java.util.Scanner;
class Q3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length");
        int r = sc.nextInt();
		int[] b = new int[r];
		int high=0;
		int low=0;
		if(r<2){
			System.out.println("Array doesn't have a second largest element");
            return;
		}
		System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < r; i++) {
                b[i] = sc.nextInt();
        }
		
		int f=b[0],s=b[0];
		int temp=0;
        for (int j = 1; j < r; j++) {
			if(b[j]>f){
				s=b[j];
				if(s>f){
					temp=f;
					f=s;
					s=temp;
				}
			}
		}
		System.out.println("second val is : "+ s);
		
		
	}
}