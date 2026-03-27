public class subsets {

  public static void  printsubsets(int i, String s, String ans){

    if(i==s.length()){

       System.out.println(ans);
     
      return;
    }
    


    char ch=s.charAt(i);

    printsubsets(i+1,s,ans+ch);//take

    printsubsets(i+1,s,ans);//not
  }

  public static void main(String[] args) {
    
    String s="abcd";

    printsubsets(0,s,"");
  }
  
}
