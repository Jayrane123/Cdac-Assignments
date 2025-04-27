public class Bubble1 {
    static void bsort(int arr[]){
        int n=arr.length;
        boolean flag;
        for(int i=0;i<n-1;i++){
            flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag =true;
                }
            }
            if (!flag) {
                break;
            }
        }      
        
    }
    static void ssort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
           // int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    //min=j;
                    i=j;
                }
            }
            // int temp=arr[min];
            // arr[min]=arr[i];
            // arr[i]=temp;
            int temp=arr[i];
            arr[i]=temp;
        }
    }
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,5,6,3,65,36,7};
        ssort(arr);
        display(arr);
    }    
}
