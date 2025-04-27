class Tree{
    Node root;
    static class Node{
        private int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
        
    }
 
    void inorder(Node n){
        if(n==null){
            return;
        }
        inorder(n.left);
        System.out.print(n.data +" ");
        inorder(n.right);
    }
    Node insertdata(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.data >= key){
            root.left=insertdata(root.left, key);
        }else if(root.data <= key){
            root.right=insertdata(root.right, key);
        }
        return root;
    }
    void insert(int key){
        root=insertdata(root,key);
    }
    Node deletedata(Node root,int key){
        if(root==null){
            return root;
        }
        if(root.data >= key){
            root.left=insertdata(root.left, key);
        }else if(root.data <= key){
            root.right=insertdata(root.right, key);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right ==null){
                return root.left;
            }
        }
        return root;
    }
    void delete(int key){
        root=deletedata(root, key);
    }
    Tree(){
        root=null;
    }
    Tree(int key){
        root=new Node(key);
    }
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insert(45);
        t.insert(10);
        t.insert(5);
        t.insert(55);
        t.insert(25);
        t.insert(35);
        t.insert(15);

        System.out.println();
        t.inorder(t.root);
    }
}