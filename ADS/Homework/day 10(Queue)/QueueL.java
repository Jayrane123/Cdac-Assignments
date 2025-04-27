public class QueueL {
    Node front,rear;
    static class Node{
        private int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }        
    }

    public QueueL() {
        front=rear=null;
    }
    
    public void enqueue(int data){
        Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next=newNode;
            rear=newNode;
    }
    public void deque(){
        if(front==null){
            System.out.println("Queue is Already Empty");
            return;
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    boolean isEmpty() {
        
        return front == null;
    }
    void display(){
        // if(isEmpty()){
        //     System.out.println("Queue is Empty");
        //     return;
        // }
        Node n=front;
        while(n !=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueL q=new QueueL();
        q.enqueue(23);
        q.enqueue(45);
        q.enqueue(34);
        q.enqueue(25);
        q.display();
        q.deque();
        q.display();

    }
}
