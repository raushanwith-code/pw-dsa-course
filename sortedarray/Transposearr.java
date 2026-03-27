public class Transposearr {

  public static void main(String[] args) {

    int arr[][]={{10,20,30},{40,50,60}};
    int row=arr.length;
    int column=arr[0].length;


    int transpose[][]=new int[column][row];

    
    for (int i = 0; i < row; i++) {

      for(int j=0; j<column; j++){

        transpose[j][i]=arr[i][j];

      }
      
    }
    for(int i=0; i<column; i++){

      for(int j=0; j<row; j++){

        System.out.print(transpose[i][j]+" ");
      }
      System.out.println();
    }
    
  }
  
}
