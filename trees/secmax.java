public class secmax {

  public static void main(String[] args) {

    int arr[]={12,23,34,56,67,78,90};

    int FirstMax=Integer.MIN_VALUE;
    int SecMax=Integer.MIN_VALUE;


    for(int i=0; i<arr.length; i++){

      if(arr[i]>FirstMax){

        SecMax=FirstMax;

        FirstMax=arr[i];

      }  else if(arr[i]>SecMax && arr[i] !=FirstMax){

        SecMax=arr[i];

      
    }
    }

    System.out.println(SecMax);
  
  }
  
}
