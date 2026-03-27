public class quciksort {

  public static void quickSort(int arr[], int lo, int hi){

    if(lo>=hi) return;

      //pvit find first of all work here
     int idx= partition(arr,lo,hi);
      quickSort(arr,lo,idx-1);
      quickSort(arr,idx+1,hi);

  }

  public static int  partition(int arr[], int lo, int hi){

      int pivot=arr[lo], pidx=lo;
      int smallercount=0;

      for(int i=lo+1; i<hi; i++){

         if(arr[i]<=pivot) smallercount++;
      }

      int correctidx=pidx+smallercount;

      //swaspping
      swap(arr,pidx,correctidx);

      int i=lo, j=hi;

      while(i<correctidx && j>correctidx){

        if(arr[i]<pidx) i++;
        else if(arr[j]>pidx) j--;

        else if(arr[i]>pidx && arr[j]<=pidx){

          swap(arr,i,j);
        }
      }
      return correctidx;
  }

  public static void print(int arr[]){

      for(int ele: arr){

         System.out.print(ele+" ");
      }
      System.out.println();
  }

  public static void swap(int arr[], int i, int j){

      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
  }
  
  public static void main(String[] args) {

    int arr[]={4,9,7,1,2,3,6,5,8};

    int n=arr.length;

    print(arr);

    quickSort(arr,0,n-1);
    print(arr);

    
  }
  
}
