import java.util.*;
public class revision {

  public static void  main(String args[]){

    Scanner Sc=new Scanner(System.in);
    int n=Sc.nextInt();

    boolean isprime=true;

    if(n<=1){

      isprime=false;

    }else{

      for(int i=2; i<n/2; i++){

        if(n%i==0){

          isprime=false;
          break;
        }
      }
    }

    if(isprime){

      System.out.println("prime number");
    }else{

       System.out.println("not  prime number");


    }

  }
  
}
