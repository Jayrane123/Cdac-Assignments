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
		String a="hello";
		String r="";
		reverse(a,a.length(),r);
	}
}

// Explaination:
// 1)In main call reverse function which give argument (string,length ,empty string)
// 2)reverse method in if block string length is 0 then print same String return
// 3)else r string  =r+CharAt(i-1) and call reverse method for (a,i-1,r) recursively call till i become 0 
// print the String r.