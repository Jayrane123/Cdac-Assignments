class Q5 {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped using temp: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped without temp: " + a + " " + b);
    }
}
