class DLL{
	Node head;
	static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = prev = null;
			
        }
    }
	void insert(int data){
		Node newNode=new Node(data);
		newNode.next=head;		
		newNode.prev=null;
		if(head != null){
			head.prev=newNode;
		}
		head=newNode;
	}
	void insertBet(Node prev,int data){
		if(prev==null){
	
			return;
		}
		// Node temp=head;
		// while(temp.next !=null || temp.data==p){
			// temp=temp.next;
		// }
		// if(temp.next==null){
			// System.out.println("Given point not found");
			// return;
		// }
		Node newNode=new Node(data);
		newNode.next=prev.next;
		prev.next=newNode;
		newNode.prev=prev;
		newNode.next.prev=newNode;
		
		
	}
	void traverse(Node temp){
		System.out.println("Forward traverse");
		if(head==null){
			System.out.println("LinkedList is Empty");
			return;
		}
		//temp=head;
		Node p=null;
		while(temp != null){
			System.out.print(temp.data +"-->");
			p=temp;
			temp=temp.next;
		}
		System.out.println();
		System.out.println("Backword traverse");
		while(p != null){
			System.out.print(p.data +"--->");
			p=p.prev;
		}
		
	}
	void append(int data){
		Node newNode=new Node(data);
		newNode.next=null;
		if(head==null){
			newNode.prev=null;
			head =newNode;
			return;
		}
		Node n=head;
		while(n.next != null){
			n=n.next;
		}
		n.next=newNode;
		newNode.prev=n;
		
		
		
	}
	void delete(Node del){
		if(head==null || del==null){
			System.out.println("LinkedList is Empty");
			return ;
		}
		if(head== del){
			head =del.next;
			if (head != null) { 
                head.prev = null;
            }
			return;

		}
		if(del.next != null){
			del.next.prev=del.prev;
		}
		if(del.prev != null){
			del.prev.next=del.next;
		}
		//del.next=del.prev=null;	
		
	}
	public static void main(String[] args) {
		DLL n1=new DLL();
		
		n1.insert(30);
		n1.insert(40);
		n1.insert(50);
		n1.insertBet(n1.head.next,45);
		n1.traverse(n1.head);
		n1.append(34);
		n1.delete(n1.head.next);
		
		n1.traverse(n1.head);
		
	}
}