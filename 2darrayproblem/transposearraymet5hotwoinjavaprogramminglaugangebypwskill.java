public class transposearraymet5hotwoinjavaprogramminglaugangebypwskill {

  public static void main(String args []){

    int arr[][]={{0,5,1},{1,2,3},{5,6,7}};

    for(int i=0; i<arr.length; i++){

      for(int j=0; j<=i; j++){

        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }

    for (int i = 0; i < arr.length; i++) {

      for (int j = 0; j < arr.length; j++) {

        System.out.print(arr[i][j]+" ");
        
      }
      System.out.println();
      
    }


  }
  
}
