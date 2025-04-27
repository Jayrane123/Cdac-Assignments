public class Queue{
    int size=5;
    int Q[] =new int[size];
    int rear, front;

    Queue() {
        //default
        front=rear =-1;
    }
    boolean isEmpty(){
        if(front== -1){
            return true; 
        }
        return false;
    }
    boolean isfull(){
        if(front ==0 && rear==size-1){
            return true;
        }
        return false;
    }
    void enqueue(int val){
        
        if(isfull()){
            System.out.println("Queue is Full");
            return;
        }else{
            if(isEmpty()){
                front++;
            }
            Q[++rear]=val;
            System.out.println("insertion is done");

        }
       
    }
    int dequeue(){
        int x;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            x=Q[front];
            if(front==rear){
                front =-1;
                rear=-1;
            }
            else{
                front++;
            }
            System.out.println("deletion completed");
            return x;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(Q[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.enqueue(11);
        q1.enqueue(21);
        q1.enqueue(31);
        q1.enqueue(31);
        q1.enqueue(141);
        q1.enqueue(14);
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.display();
    }
}