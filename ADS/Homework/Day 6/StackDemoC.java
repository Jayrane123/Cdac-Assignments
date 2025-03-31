public class StackDemoC {

    // Static nested Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
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
    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Pop an element from the stack
    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!!!");
            return -1; // Indicating stack underflow
        }
        int poppedData = head.data;
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

    // Main method to test the stack implementation
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        System.out.println("Top element is: " + peek()); // Should print 30
        System.out.println("Popped element is: " + pop()); // Should print 30
        System.out.println("Top element is: " + peek()); // Should print 20
    }
}
