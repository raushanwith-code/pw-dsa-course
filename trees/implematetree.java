import java.util.*;


class Node{

  int val;
  Node left;
  Node right;

  Node(int n){

    this.val=n;
  }
}
class implematetree{

  public static void main(String[] args) {

    Node a=new Node(1);// a is root

    Node b=new Node(41);
    Node c=new Node(2);
    Node d=new Node(3);
    Node e=new Node(4);
    Node f=new Node(5);
    

    a.left=b; a.right=c;
    b.left=d; b.right=e;
    c.right=f;

    System.out.println(b.val);
    System.out.println(a.left.val);

    
  }
}