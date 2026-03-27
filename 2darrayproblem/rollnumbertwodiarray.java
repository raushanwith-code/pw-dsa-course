import java.util.*;
public class rollnumbertwodiarray {

    public static void main(String args []){

    
     Scanner Sc=new Scanner(System.in);

      int arr[][]=new int [4][2];


        for (int i = 0; i < 4; i++) {


            for (int j = 0; j < 2; j++) {

                arr[i][j]=Sc.nextInt();
                
            }

        }
          for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();

            
        }



    }
    
}
