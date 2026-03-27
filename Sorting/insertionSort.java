public class insertionSort {

    public static void main(String[] args) {

       int arr[]={34,12,27,18,19,67,29};

        for(int i=1; i<arr.length; i++){

            int key=arr[i];
            int j=i-1;

            while(j>=0 && key<arr[j]){

                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=key;


        }

        for(int i=0; i<arr.length;i++){

            System.out.println(arr[i]);
        }
        
    }
    
}
