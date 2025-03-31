class LinkedListD1{	
	Node start;//====(head)Starting point of list (referance of Node class)
	static class Node{
		int data; //store data
		Node next;  //referance store of next node
		Node(int d){ 
			data=d;//default val for node
			next=null;// next link set null
		}
	}
	void display(){
		Node n=start;
		while(n!=null){
			//refeance valis hashcode with start with classname
			//System.out.println(n.data+" referance is "+n.next);
			System.out.print(n.data+" ---> ");
			n=n.next;
		}
		//in below lat element not get printed
		// while(n.next !=null){
			// System.out.println(n.data+" referance is "+n.next);
			// n=n.next;
		// }
	}

	public static void main(String args[]){
		LinkedListD1 l=new LinkedListD1();
		l.start = new Node(5);//create node obj
		Node second=new Node(10);
		Node third =new Node(0);
		Node four =new Node(20);
		
		l.start.next=second;
		second.next=third;
		third.next=four;
		//four.next=null;---->default null so donn't have to write
		l.display();
		//System.out.println(third.next.data);
	}
}