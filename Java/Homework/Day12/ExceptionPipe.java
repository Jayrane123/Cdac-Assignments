class ExceptionPipe{
	public static void main(String args[]){
		String s1="12";
		String s2="a";
		
		try{
			int i=Integer.parseInt(s1);
		    int j=Integer.parseInt(s2);
			int result=i/j;
			System.out.println(result);
		}catch(NumberFormatException |ArrayIndexOutOfBoundsException |NullPointerException | ArithmeticException e){
			System.out.println("Uncheked exception");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException exception");
		}catch(Exception e){
			System.out.println("Cannot ");
		}catch(Throwable e){
			System.out.println("Cannot ");
		}
		System.out.println("End..........");
		
	}
}