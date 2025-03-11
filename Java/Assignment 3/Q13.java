// 13.  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class 
// students in a single Dimensional Array. Find and display the following: 
// ○  Number of students securing 75% and above in aggregate. 
// ○  Number of students securing 40% and below in aggregate.

import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] physics = new int[20];
        int[] chemistry = new int[20];
        int[] maths = new int[20];
        int countAbove75 = 0, countBelow40 = 0;

        System.out.println("Enter marks for 20 students in Physics, Chemistry, and Maths:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            int total = physics[i] + chemistry[i] + maths[i];
            double percentage = (total / 300.0) * 100;

            if (percentage >= 75) {
                countAbove75++;
            }
            if (percentage <= 40) {
                countBelow40++;
            }
        }

        System.out.println("Number of students securing 75% and above: " + countAbove75);
        System.out.println("Number of students securing 40% and below: " + countBelow40);
    }
}
