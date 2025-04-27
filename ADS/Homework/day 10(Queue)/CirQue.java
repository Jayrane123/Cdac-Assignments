public class CirQue {
    int size=5;
    int CQ[] =new int[size];
    int rear, front;

    CirQue() {
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
            rear=(rear + 1)%size;
            CQ[++rear]=val;
            System.out.println("insertion is done");
        }
       
    }
    int dequeue(){
        int x;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            x=CQ[front];
            if(front==rear){
                front =-1;
                rear=-1;
            }
            else{
                front=(front+1)%size;
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
        for(int i=front; i!=rear ; i=(i+1)%size){
			System.out.print(CQ[i]+ " ");
			}
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
        q1.dequeue();
    }    
}
