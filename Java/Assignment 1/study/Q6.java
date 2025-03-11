import java.util.Scanner;

class Q6 {
    public static void checkVowelOrConsonant(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        checkVowelOrConsonant(ch);
    }
}
