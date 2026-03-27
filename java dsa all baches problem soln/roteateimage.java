public class roteateimage {

  
  public static void rotate(int arr[][]){

    for(int i=0; i<arr.length; i++){

      for(int j=i; j<arr.length; j++){

         int temp=arr[i][j];
         arr[i][j]=arr[j][i];
         arr[j][i]=temp;
      }
    }
  
     for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length/2; j++){
     
        int temp=arr[i][j];
       arr[i][j]= arr[i][arr.length-j-1];
        arr[i][arr.length-j-1]=temp;
        

      }}
     }
     
       
      
     public static void printarr(int arr[][]){

      for(int i=0; i<arr.length; i++){

        for(int j=0; j<arr[0].length; j++){

          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
     }

    
  

  public static void main(String[] args) {

    int arr[][]={{10,20,30},{40,50,60}};

    printarr(arr);
  System.out.println("your final result i :");
    rotate(arr);
     printarr(arr);
    

  
    
  }
  
}
