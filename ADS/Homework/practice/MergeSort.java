public class MergeSort {
    static void mergesort(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1,r);
            merge(arr, l, mid,r);
        }
    }
    static void merge(int arr[],int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k++]=L[i++];
            }else{
                arr[k++]=R[j++];
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
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
        mergesort(arr, 0, arr.length-1);
        display(arr);
    }
}
