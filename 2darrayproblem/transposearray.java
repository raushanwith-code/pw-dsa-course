import java.util.*;
public class transposearray {

    public static void main(String args []){

        System.out.println("enter your row and coloumn");

        Scanner Sc=new Scanner(System.in);

        int r=Sc.nextInt();
        int c=Sc.nextInt();

        int arr[][]=new int[r][c];

        System.out.println("enetr your arrey element");

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                arr[i][j]=Sc.nextInt();
            }
        }

        for(int i=0; i<c; i++){

            for(int j=i; j<r; j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
