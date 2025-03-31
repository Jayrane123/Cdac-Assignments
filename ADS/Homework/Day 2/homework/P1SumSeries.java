class P1SumSeries{
	static double sum(int n){
		if (n == 1) {
            return 1.0;
        }
		if(n%2==0){
			return sum(n-1)-(1.0/n);
		}else{
			return sum(n-1)+(1.0/n);
		}
		
	}
	public static void main(String args[]){
		System.out.println(sum(4));
	}
}