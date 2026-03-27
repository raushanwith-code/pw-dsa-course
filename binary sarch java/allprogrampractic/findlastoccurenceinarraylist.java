import java.util.*;
public class findlastoccurenceinarraylist {

  public static void main(String[] args) {

    ArrayList<Integer> arrlist=new ArrayList<>(List.of(5,10,15,10,20,25,10,30));

    int x=10;

    int lastoccurence=-1;
    

    for(int i=arrlist.size()-1; i>=0; i--){

      if(arrlist.get(i)==x){

        lastoccurence=i;
        break;
      }


    }
    if(lastoccurence !=-1){

       System.out.println("last occurrence"+x+"is at index"+ lastoccurence);
    }else{

        System.out.println(x+"not found in the ArrayList");
    }


    
  }
  
}
