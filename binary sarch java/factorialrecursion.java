import java.util.*;
public class factorialrecursion {

 public  static void sumofnum(int n, int sum){

  if(n==0) {

   System.out.println(sum);
  return;
  }

  sumofnum(n-1,sum+n);

    
 }
  public static void main(String[] args) {

    System.out.println("enetr a number");
    
    Scanner Sc=new Scanner(System.in);

    int n=Sc.nextInt();

    sumofnum(n,0);



   
  }
    
  }


  

