import java.util.*;

class Node{

  int data;
  Node next;

  Node(int data){

    this.data=data;
    this.next=null;


  }
}
public class printnodeele {

  public static void main(String[] args) {

    Node NewNode=new Node(10);
    NewNode.next=new Node(20);
    NewNode.next.next=new Node(56);

    Node temp=NewNode;

    while(temp !=null){
       System.out.println(temp.data);
      temp= temp.next;
    }
    
  }
  
}
