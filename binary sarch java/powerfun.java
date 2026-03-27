import java.util.*;
public class powerfun {

  public static int  calculatepower(int a, int b){

    if(b==0) return 1;

    //mian work in this code and main logic of his code are this

    return a* calculatepower(a, b-1);
  }

  public static void main(String[] args) {
    
    Scanner Sc=new Scanner(System.in);
  System.out.println("enter your base");
    int a=Sc.nextInt();
    System.out.println("eneter your power");
    int b=Sc.nextInt();

    System.out.println(calculatepower(a, b));

  }
  
}
