class Stack{
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
		return head ==null;
	}
	void push(int data){
		Node newNode =new Node(data);
		newNode.next=head;
		head=newNode;
	}
	void pop(){
		if(! isEmpty()){
			System.out.println("Stack Underflow!!!");
		    return ;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		temp=null;
		
	}

}	
	
class StackDemo1{
	public static void main(String []args){
		Stack s=new Stack();
		s.head=new Node(23);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}
}