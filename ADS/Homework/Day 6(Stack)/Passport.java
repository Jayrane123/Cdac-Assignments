import java.util.Scanner;

public class Passport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        String[] parts = name.split(" ");

        if (parts.length == 1) {
            // Only FIRSTNAME
            System.out.println(name);
        } else if (parts.length == 2) {
            // FIRSTNAME and SURNAME or MIDDLENAME
            String second = parts[1];
            char lastChar = second.charAt(second.length() - 1);
            if (isVowel(lastChar)) {
                // Treat as SURNAME
                System.out.println(second + " " + parts[0]);
            } else {
                // Treat as MIDDLENAME
                System.out.println(parts[0] + " " + second);
            }
        } else if (parts.length == 3) {
            System.out.println(parts[2] + " " + parts[0] + " " + parts[1]);
        } else {
            System.out.println(name);
        }
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
