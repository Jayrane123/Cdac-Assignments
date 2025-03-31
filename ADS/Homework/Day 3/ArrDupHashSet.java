import java.util.*;
class ArrDupHashSet{
	public static void main(String args[]){
		int []arr=new int[]{1,3,6,5,4,6,6};
		System.out.println(Arrays.toString(arr));
		Set<Integer> s=new HashSet<>();
		for(int x:arr){
			if(!s.add(x)){
				System.out.println(x+" ");
			}
		}
		
	}
}