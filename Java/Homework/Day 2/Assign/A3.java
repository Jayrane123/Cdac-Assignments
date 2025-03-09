//3. Convert double to int (Typecasting with Data Loss)

public class A3 {
    public static void main(String[] args) {
        double num1 = 10.75;
        int num2 = (int) num1; 
        System.out.println("double: " + num1);
        System.out.println("int: " + num2);
        System.out.println("Data loss: " + (num1 - num2));
    }
}