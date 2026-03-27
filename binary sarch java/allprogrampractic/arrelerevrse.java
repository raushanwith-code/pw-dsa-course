import java.util.*;
public class arrelerevrse {

  public static void main(String[] args) {

     Scanner Sc=new Scanner(System.in);

     int arr[]={1,2,3,4,5};

     int brr[]=new int[5];

     for(int i=0; i<arr.length; i++){

        brr[i]=arr[arr.length-1-i];
     }

     for(int ele: brr){

       System.out.println(ele);
     }

    // int j=0;


    // for(int i=arr.length-1; i>=0; i--){

    //     brr[j]=arr[i];
    //     j++;
    // }

    // for(int i=0; i<arr.length; i++){

    //     System.out.println(brr[i]);
    // }

    
    
  }
  
}
