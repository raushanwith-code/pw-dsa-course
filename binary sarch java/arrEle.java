public class arrEle {

  public static void arrEle(int idx, int arr[]){

    if(idx==arr.length) return;

    System.out.println(arr[idx]);

    arrEle(idx+1, arr);
  }
  public static void main(String[] args) {
    
    int arr[]={1,2,3,4,5};
    arrEle(0, arr);
  }
  
}
