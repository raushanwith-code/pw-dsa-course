import java.util.*;
public class hcf {

  public static int hcf(int a, int b){

    if(b==0){

      return a;
    }

    return hcf(b,a%b);
  }

  public static void main(String[] args) {
    
    Scanner Sc=new Scanner(System.in);

    int a=Sc.nextInt();
    int b=Sc.nextInt();

    System.out.println(hcf(a,b));


  }
  
}
