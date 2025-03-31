class RecurPower{
	static int pow(int n,int p){
		if (p == 0)
            return 1;
      
        return n * pow(n,p-1);
	}
	public static void main(String args[]){

		System.out.println(pow(3,5));
	}
}
// Explaination:
// 1)In main method i call pow method for 3 5th power
// 2)in pow now n=3 and p=5 
// 3)in Pow method 1st check p==0 then return 0 else multiply n * pow(n,power-1)
// 4)this else block recursively call till it not get 0 then it return 0 and call stack and till stackget empty.