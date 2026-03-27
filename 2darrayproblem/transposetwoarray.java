public class transposetwoarray {
  
  public static void main(String rags []){

    int arr[][]={{1,2},{3,4},{5,6}};

    int m=arr.length;
    int n=arr[0].length;

    int transpose[][]=new int [n][m]; 

    for(int j=0; j<n; j++){

      for(int i=0; i<m; i++){

     transpose[i][j]=arr[j][i];

       System.out.print(transpose[i][j]+" ");
      }
      
    }
     


  }

}
