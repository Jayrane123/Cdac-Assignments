// class RDS{
	// static void sum(int n,int a){
		// if (n == 0)
            // return 0;

        // return (n % 10) + sum(n / 10,a);
	// }
	// static int digitSum(int n,int a){
		// if(sum(n,a)){
			// return
		// }

	// }
	// public static void main(String args[]){
		// int a=3456;
		// int b=4
		// System.out.println(digitSum(a,b));
		
		
	// }
// }

class RDS {
    // Function to calculate sum of digits
    static int sum(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }

    // Function to check if sum of digits is divisible by 'a'
    static int digitSum(int n, int a) {
        int totalSum = a * sum(n);  // Multiply sum of digits by 'a'

        // Keep reducing the sum until it's a single digit
        while (totalSum > 9) {
            totalSum = sum(totalSum);
        }

        return totalSum;
    }

    public static void main(String args[]) {
        int a = 9996;
        int b = 4;
        System.out.println(digitSum(a, b)); // Call the function and print result
    }
}
