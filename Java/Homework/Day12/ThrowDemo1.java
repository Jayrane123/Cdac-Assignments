class ThrowDemo1{
	
	public static void main(String args[]){
		System.out.println("Started");
		
		try{
			
			//throw new NullPointerException();
			throw new NumberFormatException();
			
        }catch(ArrayIndexOutOfBoundsException |NullPointerException | ArithmeticException e){
			System.out.println("Uncheked exception");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException exception");
		}catch(Exception e){
			System.out.println("Cannot ");
		}catch(Throwable e){
			System.out.println("Throwable ");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("Finished");
	}
}