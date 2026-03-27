public class maxbst {

    static class Node{

        int data;
        Node left,right;

        Node(int value){

            data=value;
            left=right=null;
        }
    }
    Node root;

    Node insert(Node root, int data){

        if(root==null) return new Node(data);

        if(data<root.data){

            root.left=insert(root.left,data);
        }else{

            root.right=insert(root.right,data);
        }

        return root;
    }

    void inorder(Node root){

        if(root==null) System.out.println("tree is Empty");
    }
    while(root.left!=null){

        root=root.left;
    }

    public static int main(String[] args) {
        
    }
    
}
