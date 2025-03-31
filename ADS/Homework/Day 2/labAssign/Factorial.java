class Factorial{
	static int fact(int n){
		if(n<=1)
		   return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String []args){
		System.out.println(fact(5));
	}
	
}

// explaination:
// 1)in main i called for fact method for 5 value
// 2)in fact method assign n=5 nad 1st check if n<=1 then return 1
// 3)else n * fact method call for n-1
// 4)recursively call till n=1 then exit loop and reversively stack call till get empty.