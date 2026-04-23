import java.util.*;
public class aaditiontwoarray {

    public static void main(String args []){

        Scanner Sc=new Scanner(System.in);

        int arr[][]=new int[5][5];
        int brr[][]=new int[5][5];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                arr[i][j]=Sc.nextInt();
                
            }
            
        }

        System.out.println("Enetr Your Array Element:-";
         for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr.length; j++) {

                brr[i][j]=Sc.nextInt();
                
            }
            
        }
        System.out.println("your final result is:L");
         for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr.length; j++) {

          System.out.print(arr[i][j]+brr[i][j]);
                
            }
            System.out.println();
            
        }
       
    }
    
}
