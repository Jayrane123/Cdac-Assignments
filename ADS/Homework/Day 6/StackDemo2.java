//linkedlist implememnetation of stack



class StackDemo2{
	
	Node head;
	
	static class Node{
	int data;
	Node next;
	  Node(int d){
		data=d;
		next=null;
	  }
	}
	
	boolean isEmpty(){
		return head == null;
	}
	
	void push(char new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	int pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return -1;
		}
		Node t = head;
		head = head.next;
		t.next = null;
		t = null;
		return head.data;
	}
    // void reverse(StringBuffer str){
		// int n=str.length();
		// for(int i=0;i<n;i++){
			// push(str.charAt(i));
		// }
		// for(int i=0;i<n;i++){
			// char ch=pop();
			// str.setCharAt(i,ch); // setChar inbuild method
		// }
		
	// }

    public static void main(String args[]){
		
		StackDemo2 s=new StackDemo2();
		s.head=new Node(23);
		s.push(10);

		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}
}