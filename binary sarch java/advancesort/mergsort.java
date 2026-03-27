class mergsort{

  public static void mergarr(int arr[]){

    int n=arr.length;

    int brr[]=new int[n/2];
    int crr[]=new int[n-n/2];

    for(int i=0; i<n/2; i++){

      brr[i]=arr[i];
    }
    for(int i=0; i<n-n/2; i++){

      crr[i]=arr[i+n/2];
    }
     mergarr(brr);
    mergarr(crr);

    merge(brr,crr,arr);
  }

  public static void printArr(int arr[]){


    for(int ele: arr){

       System.out.print(ele+"       ");
    }

    //magic
   ;
     
  }

  public static void main(String[] args) {

    int arr[]={1,2,3,4,5,6,7,8,9};

    printArr(arr);

    mergarr(arr);

    printArr(arr);
    
  }
}