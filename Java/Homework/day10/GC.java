class GC{
	protected void finalize(){
		System.out.println("Finalize method called...");
	}
	
	public static void main(String args[])
	{
		GrabageCollection g1 = new GrabageCollection();
		g1=null;
		System.gc();
	}
}