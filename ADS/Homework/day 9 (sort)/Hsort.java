

public class Hsort {
    static void heapify(int arr[],int n,int i){ //n-> length of array
        int largest=i; //parent
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest =l;
        }
        if(r<n && arr[r]>arr[largest])
            largest=r;
        if(largest != i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }    
        
    }
    static void heapsort(int arr[]){
        int n=arr.length;
        //checking left or right subtree 
        for (int i= n/2-1; i>=0; i--){
            heapify(arr, n, i);
            
        }
        //replacing root node with last node :swapping
        for(int i=n-1;i>0;i--){
            swap(arr, 0, i);           
            heapify(arr, i, 0); //for samllest element
        }
        
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(" "+a);
        }
    }
  
     public static void main(String[] var0) {
        int[] var1 = new int[]{40,30,24,15,55,64};
        heapsort(var1);
        display(var1);
     }    
}
