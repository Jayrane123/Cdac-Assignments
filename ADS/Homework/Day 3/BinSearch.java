class BinSearch{
	static int search(int arr[],int v,int l,int h){
		if(h>=1){
			int mid=(l+(h-l))/2;
			if(arr[mid]==v){
				return mid;
			}
			if(arr[mid]>v){
				return search(arr,v,l,mid-1);
			}
			
			return search(arr,v,mid+1,h);
		}
		return -1;
	}
	public static void main(String args[]){
		int []arr={1,2,4,6,23,55};
		int n=arr.length;
		int v=4;
		System.out.println(search(arr,v,0,n-1));
	}
}