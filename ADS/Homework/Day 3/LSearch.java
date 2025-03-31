class LSearch{
	static int search(int arr[],int v){
		int n=arr.length;
		for(int i=0;i<n;i++){
			if(arr[i]==v){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int []arr={1,3,6,5,4,6,6};
		int v=5;
		System.out.println(search(arr,v));
		
	}	
}