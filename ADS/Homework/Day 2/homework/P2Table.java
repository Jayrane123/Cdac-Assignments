class P2Table{
	static void table(int n,int i){
		
		if(i>10){
			return ;
		}else{
			System.out.println(n*i);
			table(n,i+1);
		}
	}
	public static void main(String args[]){
		table(4,1);
	}
}