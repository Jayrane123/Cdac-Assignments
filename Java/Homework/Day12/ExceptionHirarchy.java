class ExceptionHirarchy{
	public static void main(String args[]){
		String s1="12";
		String s2="0";
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		try{
			int result=i/j;
			System.out.println(result);
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException occur");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Use Array elements");
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e){
			System.out.println("Cannot ");
		}catch(Throwable e){
			System.out.println("Cannot ");
		}
		System.out.println("End..........");
		
	}
}