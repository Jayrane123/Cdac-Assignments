//5. Demonstrate Binary, Octal, Hexadecimal, and Floating-Point Literals

public class A5 {
    public static void main(String[] args) {
        int binary = 0b1010; 
        int octal = 012;    
        int hex = 0xA;       
        double floatLit = 10.5; 

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Floating-point: " + floatLit);
    }
}