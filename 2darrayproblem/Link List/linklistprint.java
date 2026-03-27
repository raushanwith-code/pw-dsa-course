
import java.util.*;
 class Node{

   int data;
   Node next;

   Node(int data){

    this.data=data;
    this.next=null;

   } 
  }

   

public class linklistprint {
  public static void main(String[] args) {

    Node ele=new Node(1);

    ele.next=new Node(2);
    ele.next.next=new Node(3);
    ele.next.next=new Node(4);
    ele.next.next.next.next=new Node(5);

    Node temp=ele;

    while(temp !=null){

       System.out.println(temp.data);
       temp=temp.next;
    }

    
  }
  
}
