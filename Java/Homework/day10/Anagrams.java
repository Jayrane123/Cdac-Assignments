import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        
        a = a.toLowerCase();
        b = b.toLowerCase();

        
        if (a.length() != b.length()) {
            return false;
        }

        
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        scanner.close();

        
        boolean result = isAnagram(str1, str2);

        
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}



// import java.util.Scanner;

// public class Solution {
	   // static boolean isAnagram(String a, String b) {
         // a = a.toLowerCase();
         // b = b.toLowerCase();
        // if (a.length() != b.length()) {
            // return false;
        // }
        // int[] charCount = new int[26];
         // for (char c : a.toCharArray()) {
            // charCount[c - 'a']++;
        // }
        // for (char c : b.toCharArray()) {
            // charCount[c - 'a']--;
        // }
        // for (int count : charCount) {
            // if (count != 0) {
                // return false;
            // }
        // }

        // return true;
    // }
	 // public static void main(String[] args) {
    
        // Scanner scan = new Scanner(System.in);
        // String a = scan.next();
        // String b = scan.next();
        // scan.close();
        // boolean ret = isAnagram(a, b);
        // System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    // }
// }
