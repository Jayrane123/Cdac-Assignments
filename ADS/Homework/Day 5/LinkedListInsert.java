class LinkedListInsert{
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
		System.out.println();
		//in below lat element not get printed
		// while(n.next !=null){
			// System.out.println(n.data+" referance is "+n.next);
			// n=n.next;
		// }
	}
	void insert(int nData){
		Node newNode=new Node(nData);
		newNode.next=start;
		start=newNode;
	}
	void insertAfter(Node prev,int nData){
		Node newNode=new Node(nData);
		newNode.next=prev.next;
		prev.next=newNode;
		
	}
	void append(int nData){		
		if(start==null){
			start=new Node(nData);
			return;
		}
		Node n=start;
		while(n.next !=null){
			n=n.next;
			
		}
		Node newNode=new Node(nData);
		n.next= newNode;
		return;
		
	}
	void delete(int key){
		Node temp=start,prev=null;
		if(temp != null&& temp.data==key){
			start=temp.next;
			return;
		}
		while(temp != null && temp.data !=key){
			prev=temp;
			temp=temp.next;
		}
		if(temp==null){
			return;
		}
		prev.next=temp.next;
	}
	Node reverse(Node head){
		
		Node prev = null;
		Node current = head;
		Node next = null;
		while( current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		//current = prev;
		return prev;
		
	}

	public static void main(String args[]){
		LinkedListInsert l=new LinkedListInsert();
		l.start = new Node(5);//create node obj
		Node second=new Node(10);
		Node third =new Node(0);
		Node four =new Node(20);
		
		l.start.next=second;
		second.next=third;
		third.next=four;
		//four.next=null;---->default null so donn't have to write
		l.display();
		l.append(44);
		l.display();
		l.insert(22);
		l.display();
		l.insertAfter(third,34);
		l.display();
		l.start = l.reverse(l.start);
		
		l.display();
		//System.out.println(third.next.data);
	}
}