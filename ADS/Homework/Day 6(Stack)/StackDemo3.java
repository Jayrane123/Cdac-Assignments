// Linked list implementation of stack
public class StackDemo3 {

    private Node head;

    // Node class
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Push an element onto the stack
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Returning -1 to indicate underflow
        }
        int poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    // Peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; // Returning -1 to indicate underflow
        }
        return head.data;
    }

    // Reverse a StringBuffer using the stack
    public void reverse(StringBuffer str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            push(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            str.setCharAt(i, (char) pop());
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        StackDemo2 stack = new StackDemo2();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // Should print 30
        System.out.println("Popped element is: " + stack.pop()); // Should print 30
        System.out.println("Top element is: " + stack.peek()); // Should print 20

        StringBuffer sb = new StringBuffer("Hello");
        stack.reverse(sb);
        System.out.println("Reversed string is: " + sb); // Should print "olleH"
    }
}
