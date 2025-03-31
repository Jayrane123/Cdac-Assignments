class RecurSum{
	static int sum(int n){
		if (n == 0)
            return 0;


        return (n % 10) + sum(n / 10);
	}
	public static void main(String args[]){
		int a=3456;
		System.out.println(sum(a));
	}
}




// Explanation :
// 1)In main function i assign 3456 value to int variable a then i called stactic integer type method "Sum" and pass a 
// as and parameter.
// 2)in method sum i take int "a" as "n"  1st i check a is == 0 then return 0
// else i was taking % 10 of "n" to get last digit plus it with method call with(a/10)for calling remaining digit 
// 3)this will get recursive call till n==0 then return 0 then based on that it recursively call all method one by one.
// 4)basically in each call i calcute last digit and add it in previous.