import java.util.*;
class twodiarray{

    public static void main(String args[]){

        int arr[][]=new int [2][2];

        Scanner Sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length; j++){

              arr[i][j]=Sc.nextInt();
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