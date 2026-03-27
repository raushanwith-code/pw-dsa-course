import java.util.*;
public class revrse {

  public static void main(String[] args) {

    Scanner Sc=new Scanner(System.in);

    int n=Sc.nextInt();

    int revrse=0;

    while(n!=0){

      int m=n%10;

      revrse=revrse*10+m;

      n=n/10;
    }
   System.out.print(revrse);
    
  }
  
}
