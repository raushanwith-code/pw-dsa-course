public class rotatektime {

  public static void rotateRight(int arr[], int k){

     int n=arr.length;

     k=k%n; //in case k>n

     int result[]=new int [n];

     for(int i=0; i<arr.length; i++){

       result[(i+k)%n]=arr[i];
     }

     for(int ele: result){

       System.out.println(ele+" ");
     }
  }

  public static void main(String[] args) {
     int arr[]={1,2,3,4,5};
     int k=3;

     rotateRight(arr,k);
  }
  
}
