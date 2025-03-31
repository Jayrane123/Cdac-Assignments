public class SinglyLinkedList1 {
    Node start;
    static class Node{
        int  data;
        Node next;
        public Node(int data) {
            this.data=data;
            next=null;
        }
    }
    void display(){
        Node n=start;
        while(n != null){
            System.out.print(n.data+" ---> ");
            n=n.next;
        }
        System.out.println();

    }
    void insertbeg(int val){
        Node newNode=new Node(val);
        newNode.next=start;
        start=newNode;

    }
    void inBet(int val,int key){
        if(start.next==null){
            Node newNode=new Node(val);
            start=newNode;
            return;
        }
        Node n=start;
        for(int i=0;n.data!=key && n.next != null;i++){
            n=n.next;
        }
        Node newNode=new Node(val);
        if(n.next==null){
            n.next=newNode;
            return;
        }
        
        newNode.next=n.next;
        n.next=newNode;
        return;
        
    }
    void insertEnd(int val){
        if(start.next==null){
            Node newNode=new Node(val);
            start=newNode;
            return;
        }
        Node n=start;
        while(n.next != null){
            n=n.next;
        }
        Node newNode=new Node(val);
        n.next=newNode;
        return;
        
    }
    void delete(int val){
        if(start==null)return;
        Node n=start, prev=null;
       
        if(n.data==val){
            start=n.next;
            return;
        }
        
        while (n != null && n.data != val) {
            prev = n;
            n = n.next;
        }
        // for(int i=0; n != null && n.data !=val;i++){
        //     prev=n;
        //     n=n.next;
        // }
        if(n==null){
            return;
        }
        prev.next=n.next;

        return;
        
    }
    Node reverse(){
        Node prev=null, curr=start;
        while(curr != null){
            Node next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        start = prev; 
        return start;
    }
    void count(){
        int count=0;
        if(start==null){
            System.out.println("Element in the linkedlist are :"+count);
            return;
        }
        Node n=start;
        while(n != null){
            count++;
            n=n.next;
        }
        System.out.println("Element in the linkedlist are :"+count);

    }
    void middle() {
        if (start == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node slow = start;
        Node fast = start;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is " + slow.data);
    }
    public boolean hasLoop() {
        Node fast = start;
        Node slow = start;
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2
            if (slow == fast) {
                return true;           // Loop detected
            }
        }
        return false;                  // No loop
    }
    void removeDuplicates() {
        Node current = start;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip the duplicate
            } else {
                current = current.next; // Move to the next element
            }
        }
    }

      
    public static void main(String[] args) {
        SinglyLinkedList1 l=new SinglyLinkedList1();
        l.start=new Node(5);
        Node sec=new Node(6);
        Node thrd=new Node(7);

        l.start.next=sec;
        sec.next=thrd;
        //thrd.next=sec;
        System.out.println(l.hasLoop());
        l.display();
        l.insertbeg(4);
        l.insertbeg(34);
        l.insertEnd(23);
        l.display();
        l.delete(23);
        l.start=l.reverse();
        l.display();
        l.middle();
        System.out.println(l.hasLoop());
    }    
}
