/*Question 2: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend. */

    import java.util.Scanner;
    class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        sc.close();
        switch(day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Weekday");
                break;
            case 6: case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}