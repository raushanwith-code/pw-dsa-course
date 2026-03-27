import java.util.*;
class printeleofnthLevel{

  public static void main(String[] args) {

    Scanner Sc=new Scanner(System.in);

   Node a=new Node(1);
   Node b=new Node(2);
   Node c=new Node(3);
   Node d=new Node(4);
   Node e=new Node(5);
   Node f=new Node(6);
   Node g=new Node(7);
   Node h=new Node(8);
   Node i=new Node(9);

   a.left=b; a.right=c;
   b.left=d; b.right=e;
   c.left=f; c.right=g;
   e.left=h; f.right=i;

   System.out.print("preorder");
   

   System.out.println();
   System.out.println("Inorder");

   System.out.println();
   System.out.println("postorder");
  
   System.out.println();

   System.out.print("level Order");
   levelorder(a);

   System.err.println("Enten n:-");

   int n=Sc.nextInt();

   nthlevel(a,0);


  }

  private static void levelorder(Node root){

    Queue<Node> q=new LinkedList<>();
    if(root!=null) q.add(root);

    while(q.size()>0){

      Node front=q.remove();
      
      if(front.left!=null) q.add(front.left);
      if(front.right!=null) q.add(front.right);
    }
    System.out.println();
  }

  private static void  nthlevel(Node root, int level){

    if(root==null) return;
    
    nthlevel(root.left,level+1);
    nthlevel(root.right,level+1);


  }
}