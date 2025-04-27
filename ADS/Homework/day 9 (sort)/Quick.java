public class Quick {
    static void qsort(int arr[],int l,int h){
        if(l<h){
            int p=partition(arr,l,h);
            qsort(arr, l, p-1);
            qsort(arr, p+1,h);

        }
    }
    static int partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
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
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,5,6,3,65,36,7};
        display(arr);
        System.out.println();
        qsort(arr, 0, arr.length-1);
        display(arr);
    }
    
}
