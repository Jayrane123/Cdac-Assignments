import java.util.Scanner;
class Q1{
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
		for(int j=0;j<r-1;j++){
			if(b[j]>=b[j+1]){
				high=b[j];
			}else{
				high=b[j+1];
			}
		}
		System.out.println("largest Element is: "+high);
		for(int j=0;j<r-1;j++){
			if(b[j]<=b[j+1]){
				low=b[j];
			}else{
				low=b[j+1];
			}
		}
		System.out.println("Lowest Element is: "+low);
		
	}
}