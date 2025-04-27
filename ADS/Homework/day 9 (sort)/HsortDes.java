public class HsortDes{
    static void  heapify(int arr[],int n,int i){
        int smallest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]<arr[smallest]){
            smallest=l;
        }
        if(r<n && arr[r]<arr[smallest]){
            smallest=r;
        }
        if(i!= smallest){
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            heapify(arr, n, smallest);
        }
        heapsort(arr);
    }
    static void heapsort(int arr[]){
        int n=arr.length;
        for(int i=n/2;i<=0;i--){
            heapify(arr, n, i);
        }
        for(int i=n-1;i<=0;i--){
            int temp=arr[n];
            arr[0]=arr[i];
            arr[i]=arr[0];

        }
    }
    
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(" "+a);
        }
    }
  
     public static void main(String[] var0) {
        int[] var1 = new int[]{1, 2, 5, 5, 6, 3, 65, 36, 7};
        heapsort(var1);
        display(var1);
     }    
}
