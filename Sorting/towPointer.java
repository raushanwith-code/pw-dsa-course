class towPointer{

    public static void main(String[] args) {

        int arr[]={0,1,1,0,0,0,0,0,1,1,};

        int low=0, high=arr.length-1;

        while(arr[low]==0 && low<high) low++;
        while(arr[high]==1 && low<high) high--;

        while(low<high){

        if(low<high){

                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
        }
            
        }
        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }
        
    }
}