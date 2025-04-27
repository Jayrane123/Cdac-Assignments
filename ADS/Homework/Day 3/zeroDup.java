
public class zeroDup {
    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

       
        for (int left = 0; left <= length - possibleDups; left++) {
            if (arr[left] == 0) {
                
                if (left == length - possibleDups) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                possibleDups++;
            }
        }

        
        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        duplicateZeros(arr);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

}
