// Linkedlist node creation

class Node{

    int val;
    Node next;

     Node(int val){

        this.val=val;
        this.next=null;
    }
}
class basic{

    public static void main(String[] args) {

   Node a=new Node(45);
   Node b=new Node(563);

   a.next=b;

   System.out.println(b.val);
        
    }
}
