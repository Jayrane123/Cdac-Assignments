class StringD1{
	public static void main(String args[]){
		String s1="Good Morning";
		System.out.println(s1);
		
		System.out.println("charAt "+s1.charAt(3));
		System.out.println("Contains "+s1.contains("oo"));
		System.out.println("INdexOf "+s1.indexOf("o"));			
		System.out.println("substring "+s1.substring(1,8));			
		
		s1=s1.concat(" Sir ");
		System.out.println("Concat "+s1);
		System.out.println("Replace "+s1.replace("Sir","Friends"));
		
		System.out.println(""+s1.toLowerCase());
		
		System.out.println(""+s1.toUpperCase());
		
		System.out.println(""+s1);
		
		System.out.println(""+s1.trim());
		
	}	
}