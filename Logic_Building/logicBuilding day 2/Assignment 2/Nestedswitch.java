/* Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. */

import java.util.Scanner;

class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = sc.nextInt();

        int failCount = 0;

        if (subject1 < 40) failCount++;
        if (subject2 < 40) failCount++;
        if (subject3 < 40) failCount++;

        switch (failCount) {
            case 0:
                System.out.println("The student has passed.");
                break;
            default:
                System.out.println("The student has failed in " + failCount + " subject(s).");

                switch (failCount) {
                    case 1:
                        System.out.println("Needs slight improvement.");
                        break;
                    case 2:
                        System.out.println("Needs more effort.");
                        break;
                    case 3:
                        System.out.println("Failed in all subjects. Must retake the exam.");
                        break;
                }
        }

        sc.close();
    }
}
