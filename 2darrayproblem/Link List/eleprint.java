import java.util.*;

class node{

  int data;
  node next;

  node(int data){

     this.data=data;
     this.next=null;
  }

}
public class eleprint {

  public static void main(String[] args) {

    node newnode=new node(10);
    newnode.next=new node(20);
    newnode.next.next=new node(78);

    node temp=newnode;

    while(temp !=null){

      System.out.println(temp.data)
;
temp=temp.next;    }
    
  }
    
}
