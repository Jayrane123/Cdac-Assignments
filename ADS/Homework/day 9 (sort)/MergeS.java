public class MergeS {
    static void mergesort(int arr[],int l,int r){
        int count=-1;
        count++;
        System.out.println(count+" l "+ " m "+" l");
        if(l<r){
            int mid=(l+(r-l)/2);
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr,l,mid,r);
            System.out.print(l+" "+mid+" "+r);
            System.out.println();
        }
    }
    static void merge(int []arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<= R[j]){
                arr[k]=L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

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
        mergesort(arr, 0, arr.length-1);
        display(arr);
    }    
}
