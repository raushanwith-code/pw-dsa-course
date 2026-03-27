import java.util.*;
class Node{

  int data;
  Node left;
  Node right;

  Node(int value){

    data=value;
    left=right=null;
  }
}

class Tree{

  Node root;

  void postorder(Node node){

    if(node==null)  return;

    postorder(node.left);
    postorder(node.right);

    System.out.print(node.data+" ");
  }
}
public class inordertravrser {

  public static void main(String[] args) {
    
  

  Tree tree=new Tree();
  tree.root=new Node(1);
  tree.root.left=new Node(2);
  tree.root.right=new Node(3);
  tree.root.left.left=new Node(5);

  System.out.println("postorder Traversal");

  tree.postorder(tree.root);

  }
  
}
