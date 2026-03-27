class binaryserch1{

  public static void main(String[] args) {
    
    int arr[]={1,2,3,4,5,6,7,8,9};

    int n=arr.length;

    int target=5;

    boolean flag=false;
    
    int low=0, high=n-1;

    while(low<=high){

     int mid=(low+high)/2;

     if(arr[mid]==target) {

     flag=true;
     }

     else if(arr[mid]>target) high=mid-1;

     else low= mid+1;
       
    }
    if(flag) System.out.println("elementis found");
    else System.out.println("element is not found");
  }
}