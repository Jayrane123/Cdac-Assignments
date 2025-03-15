
//11. Demonstrate Assignment Operators

public class A12 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        a += b; // a = a + b
        System.out.println("+= : " + a);
        a -= b; // a = a - b
        System.out.println("-= : " + a);
        a *= b; // a = a * b
        System.out.println("*= : " + a);
        a /= b; // a = a / b
        System.out.println("/= : " + a);
        a %= b; // a = a % b
        System.out.println("%= : " + a);
    }
}