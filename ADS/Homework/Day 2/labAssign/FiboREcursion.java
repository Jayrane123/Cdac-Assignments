class FiboREcursion{
    static int fibonacci(int n){
	    if(n<=1){
		  return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String []args){
		int num=5;
		for(int i=0;i<=num;i++){
			System.out.println(fibonacci(i)+" ");
		}
		
	}	
}

// Explaination:
// 1)in Fibonachi method i was checking if give value is less than or eual to 1 then return n
// 2)else return fibonacci(n-1)+fibonacci(n-2) untill n==1 then excute if block and call all stack call and generate result