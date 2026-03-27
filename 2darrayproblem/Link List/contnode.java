import java.util.*;

class Node{
  
  int data;
  Node next;

  Node(int data){
     
    this.data=data;
    this.next=null;
  }
}
public class contnode {

  public static void main(String[] args) {

    int count=0;

    Node newNode=new Node(10);
    newNode.next=new Node(20);
    newNode.next.next =new Node(39);

    Node temp=newNode;

    while(temp !=null){

      count++;
      temp=temp.next;
    }

    System.out.println(count);

    
  }
  
}
