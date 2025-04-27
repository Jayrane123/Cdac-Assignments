
public class Insertion {
    static void isort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {1,2,5,5,6,3,65,36,7};
        isort(arr);
        display(arr);
    }      
}
