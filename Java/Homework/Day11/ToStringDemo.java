class ToStringDemo{
	String name;
	int id;
	ToStringDemo(String name,int id){
		this.name=name;
		this.id=id;
		
		}
	@Override
    public String toString(){
		return "ToStringDemo{"+name+" "+ id+"}";
	}	
	public static void main(String args[]){
		ToStringDemo t1=new ToStringDemo("Jay",111);
		System.out.println(t1);// t1.toString method by default call this method call from Object class and inherite
		
	}	
}