// Problem 2: 
// Write a program that performs the following operations on strings: 
// 1. Check whether two given strings are anagrams of each other. 
// 2. Identify the longest word in a given sentence. 
// 3. Count the number of vowels and consonants in the same sentence. 
// Input: 
// String 1: listen   
// String 2: silent   
// Sentence: Practice makes a man perfect 
// Output: 
// Are 'listen' and 'silent' anagrams? true   
// Longest word: Practice   
// Vowels: 9, Consonants: 17 

public class Q2 {
    static boolean isAnagrams(String listen,String silent){
        if(listen.length() != silent.length()){
            return false;
        }
        String str1= listen.replaceAll(" ", "").toLowerCase();
        String str2= listen.replaceAll(" ", "").toLowerCase();
        int[] charCounts = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i) - 'a']++;
            charCounts[str2.charAt(i) - 'a']--;
        }
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }
    static void largeW(String a,String b){
        String[] words = a.split("\\s+");

        for (String word : words) {
            if(words)
        }
    }
    public static void main(String[] args) {
        String listen="Practice makes a man perfect";
        String silent="Practice makes a man perfect";
        isAnagrams(listen, silent);
    }
}    
