class Stack{
	static final int max=7;
	int top;     //----(toss are same)
	int a[]=new int[max];
	Stack(){
		top=-1;
	}
	boolean isEmpty(){
		return top<0;
	}
	boolean isFull(){
		return top>=max-1;
	}
	boolean push(int x){
		if(top >= (max-1)){
			System.out.println("Stack Overflow!!!");
			return false;
		}else{
			a[++top]=x;
			System.out.println(x+" Element push");
			return true;
		}
	}
	int pop(){
		if(top<0){
			System.out.println("Stack Underflow!!!");
		    return 0;			
		}else{
			int x= a[top--];
			return x;
		}

	}
	int peek(){
		if(top<0){
			System.out.println("Stack Underflow!!!");
		    return 0;
		}
		else{
			int x=a[top];
			return x;
		}
	}
	void display() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Stack elements (top to bottom):");
		for (int i = top; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}
	
}
class StackDemo{
	public static void main(String []args){
		Stack s=new Stack();
		s.push(40);
		s.push(30);
		s.push(20);
		s.display();
		System.out.println();
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.display();
	}
}