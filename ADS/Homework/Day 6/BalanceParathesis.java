public class BalanceParathesis {
    static class Node {
        char data;
        Node next;

        Node(char d) {
            data = d;
            next = null;
        }
    }

    private static Node head;

    public static boolean isEmpty() {
        return head == null;
    }
    public static void push(char data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static char pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!!!");
            return '\0'; 
        }
        char poppedData = head.data;
        head = head.next;
        return poppedData;
    }

    public static char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return head.data;
    }

	public static boolean isbalance(String s) {
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
            push(s.charAt(i));
        } else {
            if (!isEmpty() && 
                ((peek() == '(' && s.charAt(i) == ')') || 
                 (peek() == '[' && s.charAt(i) == ']') || 
                 (peek() == '{' && s.charAt(i) == '}'))) {
                pop();
            } else {
                return false;
            }
        }
    }
    return isEmpty();
    }

 
    public static void main(String[] args) {
		String s = "{([)])}";
		if (isbalance(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

   
    }
}
