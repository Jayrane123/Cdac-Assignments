import java.util.*;
class ArrDup1{
	public static void main(String args[]){
		int []arr=new int[]{1,3,6,5,4,6,6};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	for(int i=0;i<arr.length-1;i++){
		if(arr[i]==arr[i+1]){
			System.out.println(arr[i]);
		}
	}
		
	}
}