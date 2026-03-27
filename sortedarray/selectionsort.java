class selectionsort{

    public static void main(String[] args) {

        int arr[]={10,-4,20,1,8,-6};

        for(int i=0; i<arr.length-1; i++){

            int min= arr[i];
            int mindx=i;

            for(int j=i+1; j<arr.length; j++){

                if(arr[j]<min){

                    min=arr[j];
                    mindx=j;
                }

            }
            // swap the value

            int temp=arr[i];

            arr[i]=arr[mindx];

            arr[mindx]=temp;


        }
        for(int ele: arr){

        System.out.println(ele);
    }
}

     
    }

    