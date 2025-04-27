public class Quick {
   static void quicksort(int arr[],int l,int h){
    if(l<h){
        int pi=partition(arr, l, h);
        quicksort(arr, l, pi-1);
        quicksort(arr, pi+1, h);
    }
   } 
   static int partition(int arr[],int l,int h){
     int pivot=arr[h];
     int i=l-1;
     for(int j=l;j<=h-1;j++){
        if(arr[j]<pivot){
            i++;
            swap(arr,i,j);       
        }
     }
     swap(arr, i+1, h);
     return i+1;
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
   }
   public static void main(String[] args) {
    int arr[]= {1,2,5,5,6,3,65,36,7};
        display(arr);
        System.out.println();
        quicksort(arr, 0, arr.length-1);
        display(arr);
   }
}
