class RotateImage{

  public static void main(String[] args) {

    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

    for(int i=0; i<arr.length; i++){

      for(int j=0; j<arr[0].length; j++){ 

        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }

    for(int i=0; i<arr.length; i++){

      for(int j=i+1; j<arr[0].length; j++){

       int temp=arr[i][j];
       arr[i][j]=arr[j][i];
       arr[j][i]=temp;
      }
    }
     for(int i=0; i<arr.length; i++){

      int left=0, rigth=arr[i].length-1;

      while(left<=rigth){

        int temp=arr[i][left];
        arr[i][left]=arr[i][rigth];
        arr[i][rigth]=temp;
        left++;
        rigth--;
      }
     }
    System.out.println("your final ans :");
    for(int i=0; i<arr.length; i++){

      for(int j=0; j<arr[0].length; j++){

        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}