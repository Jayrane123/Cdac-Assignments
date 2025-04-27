
class BT{
    Node root;
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    BT(){
        root=null; //Empty tree
    }
    BT(int d){
        root=new Node(d);
    }
    void preorder(Node n){
        if(n==null){
            return;
        }
        System.out.print(n.data +" ");
        preorder(n.left);
        preorder(n.right);

    }
    void inorder(Node n){
        if(n==null){
            return;
        }
        inorder(n.left);
        System.out.print(n.data+" ");
        inorder(n.right);

    }
    void postorder(Node n){
        if(n==null){
            return;
        }
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.data+" ");
    }
    Node insertdata(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key <= root.data){
            root.left=insertdata(root.left,key);
        }
        else{
            root.right=insertdata(root.right,key);
        }
        return root;
    }
    public static void main(String[] args) {
        BT t1=new BT();
        //TreeD t1=new TreeD(3); Another way
        t1.root=new Node(20);
        t1.root.left=new Node(10);        
        t1.root.right=new Node(30);        
        t1.root.left.left=new Node(5);        
        t1.root.left.right= new Node(15);        
        t1.root.right.left=new Node(25);        
        t1.root.right.right = new Node(35);      
        t1.preorder(t1.root);  
        System.out.println();
        t1.inorder(t1.root);  
        System.out.println();
        t1.postorder(t1.root); 
        System.out.println();
        t1.insertdata(t1.root, 13);
        t1.inorder(t1.root);  

    }
}