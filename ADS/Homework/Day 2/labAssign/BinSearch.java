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


// Explanation: 
// 1)In main method i have declared one array ,its length and element which i want to retrive this argument  
// 2)call search function with 4 paramether (arr,value,low=0,high=n-1) in search 1st if block check high is greterthan and equal to 1 
// else -1.
// 3)in if block set local variable mid = low +(high-low)/2 go get mid value after that i check in if block where if value is == mid reurn mid as its index
// 4)otherwise it goes in if block whre it check value is < arr[mid] then call search method for low to mid-1
// 5)call called search method mid+1 to high 
// 6)call it recursively till not get value.