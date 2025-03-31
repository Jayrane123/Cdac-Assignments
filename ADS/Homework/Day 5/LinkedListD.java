class LinkedListD{
	//Node asscebile because class Node is Static class so it run when program run
	Node start;//====(head)Starting point of list
	static class Node{
		int data; //store data
		Node next;  //referance store of next node
		Node(int d){ 
			data=d;//default val for node
			next=null;// next link set null
		}
	}

	public static void main(String args[]){
		LinkedListD l=new LinkedListD();
		l.start = new Node(5);//create node obj
		Node second=new Node(10);
		Node third =new Node(15);
		Node four =new Node(15);
		
		l.start.next=second;
		second.next=third;
		third.next=four;
		four.next=null;
		
		System.out.println(third.next.data);
	}
}