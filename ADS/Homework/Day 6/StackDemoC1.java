public class StackDemoC1 {

    // Static nested Node class
    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    // Top of the stack
    private static Node head;

    // Check if the stack is empty
    public static boolean isEmpty() {
        return head == null;
    }

    // Push an element onto the stack
    public static void push(char data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    // Pop an element from the stack
    public static char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!!!");
            return '\0'; // Indicating stack underflow
        }
        char poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    // Peek at the top element of the stack
    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Indicating empty stack
        }
        return head.data;
    }
   public static void reverse(StringBuffer str){
		int n=str.length();
		for(int i=0;i<n;i++){
			push(str.charAt(i));
		}
		for(int i=0;i<n;i++){
			char ch=pop();
			str.setCharAt(i,ch); // setChar inbuild method
		}
		
	}
    // Main method to test the stack implementation
    public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Hello");
    reverse(sb);
    System.out.println("Reversed string is: " + sb); 
    }
}
