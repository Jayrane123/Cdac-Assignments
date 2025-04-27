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
        String str2= silent.replaceAll(" ", "").toLowerCase();
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
        String[] w1= a.split(" ");
        String[] w2= b.split(" ");
        String longestWord = "";

        for (String word :w1) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        for (String word :w2) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest wors is : "+longestWord);
}
static void vowel(String listen,String silent){
    String str1= listen.replaceAll(" ", "").toLowerCase();
    String str2= silent.replaceAll(" ", "").toLowerCase();
    int v=0,c2=0;
    for (int i = 0; i < str1.length(); i++) {
        char c=str1.charAt(i);
       
        if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
            v++;
        }else{
            if((c-'a')<26 || (c-'a')>=0){
                c2++;
            }
        }
        //     if (Character.isLetter(c)) {
    //         if ("aeiou".indexOf(c) != -1) {
    //             v++;
    //         } else {
    //             c2++;
    //         }
    //     }
    // }    
    // for (int i = 0; i < str2.length(); i++) { 
    //     char c1=str2.charAt(i);   
    //     if (Character.isLetter(c1)) {
    //         if ("aeiou".indexOf(c1) != -1) {
    //             v++;
    //         } else {
    //             c2++;
    //         }
    //     }
       
    }
   
    
    for (int i = 0; i < str2.length(); i++) {
        char c=str2.charAt(i);
       
        if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
            v++;
        }else{
            if((c-'a')<26 || (c-'a')>=0){
                c2++;
            }
        }
    } 
    System.out.println("Vowels: "+v +" Consonants: "+c2);
}
    public static void main(String[] args) {
        String listen="Practice makes a man perfectz";
        String silent="Practice makes a man perfect";
        isAnagrams(listen, silent);
        largeW(silent, silent);
        vowel(listen, silent);
    }
}    
