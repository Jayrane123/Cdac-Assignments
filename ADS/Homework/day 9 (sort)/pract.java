public class pract {
    static void  mergeSort(int arr[],int l,int r){       
        if(r>l){
            int mid=l+(r-l)/2;
            mergeSort(arr,l, mid);
            mergeSort(arr, mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=l;
        while (i<n1 && j<n2) { 
            if(L[i]<=R[j]){
                arr[k++]=L[i++];
            }else{
                arr[k++]=R[j++];
            }
        }
        while(i < n1){
            arr[k++]=L[i++];
        }
        while(j < n2){
            arr[k++]=R[j++];
        }


    }
    static void isort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;


        }
    }
    static void ssort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    //min=j;
                    i=j;
                }
            }
            int temp=arr[i];
            arr[i]=temp;

        }
    }
    static void quicksort(int arr[],int l,int h){
        if(l<h){
            int pi=partition(arr,l,h);
            quicksort(arr, l, pi-1);
            quicksort(arr, pi+1,h);
        }
    }
    static int partition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<=pivot){
                i=i+1;
                swap(arr,i,j);
           
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr [i]=arr[j];
        arr [j]= temp;
    }
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(" "+a);
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,5,6,3,65,36,7};
        display(arr);
        System.out.println();
        // mergeSort(arr, 0, arr.length-1);
        // isort(arr);
        quicksort(arr, 0, arr.length-1);
        display(arr);        
    }
}
