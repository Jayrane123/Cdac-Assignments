public class heapDec {
    static void heapify(int arr[],int n,int i){
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;
        if(l<n && arr[l]<arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]<arr[largest]){
            largest=r;
        }
        if(largest !=i){
            swap(arr,i,largest);
            heapify(arr, n, largest);
        }
    }
    static void heapsort(int arr[]){
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            swap(arr, 0, i);
            heapify(arr, i,0);
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
      static void display(int arr[]){
        for (Object x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) {
        int arr[]= {1,2,5,5,6,3,65,36,7};
        display(arr);
        
        heapsort(arr);
        display(arr);
    }
}
