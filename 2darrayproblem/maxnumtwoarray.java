public class maxnumtwoarray {

    public static void main(String args []){

        int arr[][]={{1,5,6},{2,-9,3},{5,10,3}};

        int mx=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {

               while(arr[i][j]>mx){

                mx=arr[i][j];
               } 
                
            }
        }
        System.out.print(mx);
    }
    
}
