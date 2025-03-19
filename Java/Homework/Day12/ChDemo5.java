import java.io.*;
class ChDemo5{
	public static void main(String args[])throws IOException{
		File f=new File("abc.txt");
		try{
			FileReader fr=new FileReader(f);
		}catch(FileNotFoundException e){
			System.out.println("1");
		}
        		
	}
}