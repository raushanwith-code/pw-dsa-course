public class permitionofstring {

  public static void printper(String ans, String s){

    if(s.length()==0){

      System.out.println(ans);
      return;
    }
    for(int i=0; i<s.length(); i++){

      char ch=s.charAt(i);

      String left=s.substring(0,i);
      String rigth=s.substring(i+1);
      printper(ans+ch, left+rigth);
    }
  }
  
  public static void main(String[] args) {

    String s="abcd";

    printper("",s);


    
  }
  
}
