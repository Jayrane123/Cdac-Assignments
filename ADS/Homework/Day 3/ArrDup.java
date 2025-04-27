
import java.util.*;
class ArrDup{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element size");
		int a=sc.nextInt();
		System.out.println("print element");
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(" .....");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}