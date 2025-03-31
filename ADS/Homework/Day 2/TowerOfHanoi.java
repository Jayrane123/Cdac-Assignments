class TowerOfHanoi{
	static void toh(int n,char source,char inter,char destination){
		if(n==1){
			System.out.println("Disk from "+source+" to "+destination);
			
		}else{
			
			toh(n-1,source,destination,inter);
		    System.out.println("Disk from "+source+" to "+destination);
			toh(n-1,inter,source,destination);
		}
		
	}
	public static void main(String []args){
		int m=3;
		toh(m,'A','B','C');
		
	}	
}


Explaination:
1)Here i pass 3 have 3 disk .in main method i have call my toh method with 4 argument with disk count and pole name
2)when toh method call that time it's value disk is 3 then then at line 3 it check disk count is 1 but disk count is 3 then it go t else block 
and call toh method as disk-1,source as source ,destination as intermidediate and intermidite pole as destination.means
disk count is now to and get get method it call recursively till disk= 1 then it execute if blocke and exit method return 
then return to else block at line 9 and print SOP statement as disk call "toh method" for disk 2 go to line 2 for method call
then recursivly call 8 till 1 execute if block and go outside return to else block second line (9)print SOP as
disk 2 and go to line 9 conver disk 2 to(2-1).call toh method it now it go out of else block and execute if block get exit.
