import java.util.*;
class febonachinum{

  public static int febonum(int n){

    if(n==0||n==1){

      return n;
    }

    return febonum(n-1)+febonum(n-2);
  }

  public static void main(String[] args) {
    
    Scanner Sc=new Scanner(System.in);

    int n=Sc.nextInt();

    for(int i=0; i<n; i++){

      System.out.println(febonum(i));


    }
  }
}