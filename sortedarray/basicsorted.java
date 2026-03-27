import java.util.*;
import java.util.Arrays;

class basicsorted{

  public static void main(String[] args) {
    
    int arr[]={1,5,7,9,-7,-5};

    Arrays.sort(arr);

    for(int ele: arr){

      System.out.print(ele+" ");
    }

  }
}