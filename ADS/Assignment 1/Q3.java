// Problem 3: 
// Given a sorted array of integers (which may include duplicates), perform the following 
// operations: 
// 1. Search for a given key and return its index (if found) with Binary Search. 
// 2. Find the first and last occurrence of the key in the array. 
// 3. Count the total number of times the key appears. 
// 4. Find any peak element in the array (an element greater than its neighbors). 
// Input: 
// arr = [1, 3, 3, 3, 5, 6, 8], key = 3 
// Input for Peak Element: 
// arr =[1, 2, 18, 4, 5, 0] 
// Output: 
// Key found at index: 2   
// First occurrence: 1   
// Last occurrence: 3   
// Total count of key: 3   
// Peak element: 18
public class Q3 {
    static int index(int arr[],int key){

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         System.out.println("Key found at index: "+i);
        //         return;
        //     }
        // }
        // System.out.println("key Index not found");
        int result = -1;
        int left = 0;
        int right = arr.length - 1;       
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==key){
                   result=mid;
                   right=mid-1;
                }else if (arr[mid] < key){
                     left = mid + 1;
                }else{
                    right=mid-1;
                }     

            }
        return result;
    }
    static void firstlast(int arr[],int key){

        int first = -1;
        int last = -1;
        int left = 0;
        int right = arr.length - 1;       
            
        while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==key){
                    first=mid;
                   right=mid-1;
                }else if (arr[mid] < key){
                     left = mid + 1;
                }else{
                    right=mid-1;
                }     

            }
       
        left = 0;
        right = arr.length - 1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                last=mid;
                left=mid+1;
            }else if (arr[mid] < key){
                 left = mid + 1;
            }else{
                right=mid-1;
            }     

        }
        System.out.println("First occurrence: "+first);
        System.out.println("Last occurrence: "+last);

    }
    static void count(int arr[],int key){
        int c = 0;
        int left = 0;
        int right = arr.length - 1;       
            
        while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==key){
                    c++;
                   right=mid-1;
                }else if (arr[mid] < key){
                     left = mid + 1;
                }else{
                    right=mid-1;
                }     

            }
       
        left = 0;
        right = arr.length - 1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==key){
                c++;
                left=mid+1;
            }else if (arr[mid] < key){
                 left = mid + 1;
            }else{
                right=mid-1;
            }     

        }
        System.out.println("Total count of key: "+c);
    }
    static void peekneighbors(int arr[]){
        int peak=arr[1];
        for(int i=2;i<arr.length;i++){
            if(arr[i]>peak){
               peak=arr[i];
            }
        }
        System.out.println("Peak element: "+peak);
    }


    public static void main(String[] args) {
        int arr[]={1, 3, 3, 3, 5, 6, 8};
        int arr1[]={1, 2, 18, 4, 5, 0};
        
        System.out.println(index(arr, 3));
        firstlast(arr, 3);
        count(arr,3);
        peekneighbors(arr1);
    }
}
