class P4Reverse{
	static void reverse(String a,int i,String r){
		
		if(i==0){
			System.out.println(a);
			System.out.println(r);
			return;
		}else{
			r +=a.charAt(i-1);
			reverse(a,i-1,r);
		}
	}
	public static void main(String args[]){
		String a="CDACMumbai";
		String r="";
		reverse(a,a.length(),r);
	}
}