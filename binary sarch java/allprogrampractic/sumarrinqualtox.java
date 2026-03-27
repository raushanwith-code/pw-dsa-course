public class sumarrinqualtox {


  public static void findDoubleWithSum(int arr[], int targetSum){

    for(int i=0; i<=arr.length-1; i++){

       for(int j=i+1; i<=arr.length-1; j++){

          if(arr[i]+arr[j]==targetSum){

            System.out.println("doubt your sum is:"+arr[i]+"+ "+arr[j]);

            return;


          }
       }
    }

    System.out.println(targetSum);

      
  }

  public static void main(String[] args) {
    
    int arr[]={2,5,8,10,15};

    int targetSum=18;
      
    findDoubleWithSum(arr,targetSum);
  }
  
}
