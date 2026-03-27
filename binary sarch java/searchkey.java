class searckey{


  public static int BinearySeach(int arr[], int key){

     int low=0;
    int hi=arr.length-1;

    while(low<=hi){

     int  mid=low+(hi-low)/2;

     if(arr[mid]==key){

      return mid;
    }

    if(arr[mid]<key){

      low=mid+1;
    }else{

      hi=mid-1;
    }
    
    return -1;
    


  }

  public static void main(String[] args) {

    int arr[]={1,2,3,4,5,6,7,8,9};

    int key=8;

    System.out.println()

   
    }
    
  }
