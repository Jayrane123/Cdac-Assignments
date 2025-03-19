class HashCodeDemo{
	String name;
	int id;
	int mainId;
	HashCodeDemo(String name,int mainId,int id){
		this.name=name;
		this.mainId=mainId;
		
		
		}
	 public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        HashCodeDemo that = (HashCodeDemo) obj;
        return mainId == that.mainId && id == that.id && name.equals(that.name);
    }
	@Override
    public int hashCode(){
		return  mainId*7;   //Using id as uniq hash code must be return
	}	
	public static void main(String args[]){
		HashCodeDemo t1=new HashCodeDemo("Jay",344,34);
		HashCodeDemo t2=new HashCodeDemo("Jay",344,34);
		System.out.println(t1.hashCode());
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
	}	
}