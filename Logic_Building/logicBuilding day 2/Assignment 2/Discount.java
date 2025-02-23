/*Question 4: Discount Calculation 
Write a program to calculate the discount based on the total purchase amount. Use the following 
criteria: 
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount. 
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount. 
 If the total purchase is less than Rs.500, apply a 5% discount. 
Additionally, if the user has a membership card, increase the discount by 5%. */

    import java.util.Scanner;
    class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();
        System.out.print("Do you have a membership card? (yes/no): ");
        boolean hasMembership = sc.next().equalsIgnoreCase("yes");
        sc.close();
        
        double discount = (amount >= 1000) ? 20 : (amount >= 500) ? 10 : 5;
        if (hasMembership) {
            discount += 5;
        }
        double finalAmount = amount - (amount * discount / 100);
        System.out.println("Final price after " + discount + "% discount: Rs." + finalAmount);
    }
}