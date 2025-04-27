import java.util.*;
public class SecLar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int high=arr[0];
        int sec=arr[1];
        for(int i=2;i<n;i++){
            if(arr[i]>sec){
                if(arr[i]>high){
                    sec=high;
                    high=arr[i];
                }else{
                    sec=arr[i];
                }
            }
        }
        System.out.println(sec);

    }
}
