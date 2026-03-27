class rotatedimage{
  public static void main(String[] args) {

    int arr[][]={{10,20,30,40},{50,60,70,80}};

   int row=arr.length;
   int column=arr[0].length;

   int transarr[][]=new int [column][row];

   for (int i = 0; i < row; i++) {
    
      for(int j=0; j<column; j++){

          transarr[j][i]=arr[i][j];
      }

   }

    for(int i=0; i<row; i++){

       for(int j=0; j<arr[0].length; j++){

          System.out.print(arr[i][j]+" ");
       }
       System.out.println();
    }
    
  }

}
