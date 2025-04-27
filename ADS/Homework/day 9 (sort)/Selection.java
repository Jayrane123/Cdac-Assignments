public class Selection {
    static void ssort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5, 1, 12, -5, 16, 2, 12, 14};
        ssort(arr);
        display(arr);
    }       
}
