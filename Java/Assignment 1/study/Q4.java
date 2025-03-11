class Q4 {
    public static void main(String[] args) {
        int num = 50;
        Double doubleValue = Double.valueOf(num);
        double d = doubleValue;

        Double doubleNum = 30.5;
        int intValue = doubleNum.intValue();

        System.out.println("Integer to Double: " + d);
        System.out.println("Double to Integer: " + intValue);
    }
}
