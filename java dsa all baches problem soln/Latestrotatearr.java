public class Latestrotatearr {

  public static void printarr(int arr[][]){

    int r=arr.length;
    int c=arr[0].length;

    for(int i=0; i<r; i++){

      for(int j=0; j<c; j++){

        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static int [][]Transposearr(int arr[][]){
   
    int r=arr.length;
    int c=arr[0].length;
    int trans[][]=new int[c][r];

    for(int i=0; i<r; i++){

       for(int j=0; j<c; j++){

         trans[j][i]=arr[i][j];
       }
    }
    return trans;
     
     }
     public static void main(String[] args) {

    int arr[][]={{1,2,3},{4,5,6}};

    printarr(arr);
   int transposed[][]= Transposearr(arr);


   printarr(transposed);
   

    
    
  }
  
}
