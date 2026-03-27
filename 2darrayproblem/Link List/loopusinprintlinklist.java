import java.util.*;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data=data;
    this.next=null;
  }
}

public class loopusinprintlinklist {

  public static void main(String[] args) {

    Scanner Sc=new Scanner(System.in);

    Node head=null, tail=null;

    System.out.println("Enter your Node size");

    int n=Sc.nextInt();

    System.out.println("enetr your newnodeelement");

    for(int i=0; i<n; i++){
       
      int data=Sc.nextInt();

      Node newNode=new Node(data);

      if(head==null){

         head=newNode;
         tail=newNode;
      }else{
        tail.next=newNode;
        tail=newNode;
      }
    }
    System.out.println("your final linklist is:");
    Node temp=head;
    while(head !=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
    System.out.println("null");
    
  }
  
}
