public class prac{
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
int k = 3;
int maxSum = 0, windowSum = 0;

for(int i = 0; i < k; i++) windowSum += arr[i];  // first window
maxSum = windowSum;

for(int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k]; // slide the window
    maxSum = Math.max(maxSum, windowSum);
}
System.out.println("Max sum: " + maxSum);

}
}