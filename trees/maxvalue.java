import java.util.*;
class Node{

  int data;
  Node left,right;

  Node(int value){

    this.data=value;
    left=right=null;
  }

}
class maxvalue{

 public static int findMax(Node root){

  if(root==null){

     return Integer.MIN_VALUE;
  }
  int leftMax=findMax(root.left);
  int rightMax=findMax(root.right);

  return Math.max(root.data, Math.max(leftMax,rightMax));

      
  }


 public static void main(String[] args) {

  Node root=new Node(20);
  root.left=new Node(15);
  root.right=new Node(15);
  root.left.left=new Node(25);
  root.left.left=new Node(5);
  root.right.right=new Node(40);

  System.out.println(findMax(root));

  

 }

}