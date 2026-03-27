public class targetsum {

  public static void targetsum(int arr[], int target){

      for(int i=0; i<arr.length-1; i++){

         for(int j=i+1; j<arr.length; j++){

          if(arr[i]+arr[j]==target){

            System.out.println(+target+" "+arr[i]+" "+arr[j]);

            return;

          }

         }
      }

       System.out.println("not found with sum");
  }

  public static void main(String[] args) {
     
    int arr[]={2,5,8,10,15};

    int target=28;

      targetsum(arr, target);
  }
  
}
