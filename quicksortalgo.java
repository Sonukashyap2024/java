public class quicksortalgo {
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
    public static int partition(int[]arr,int low,int hi){
        int pivot= arr[low] ;
        int pivotidx=low;

            int smallercount=0;
            for (int i = low+1; i < arr.length; i++) {
                if(arr[i]<=pivot) smallercount++;    
            }
            //pivot correct postoion = low+smallercount

             int correctidx=low+smallercount;

          //  swap  kroo pivot idx ko correctidx se
         swap(arr, pivotidx, correctidx);
       
               //partition
             int i=low,j=hi;
             while(i<correctidx && j>correctidx){
                         if(arr[i]<pivot) i++;
                   else if(arr[j]>pivot)  j--;

                   else if( arr[i]>pivot && arr[j]<=pivot){
                    swap(arr, i, j);
                    i++;
                    j--;
                   }
             }
             return correctidx;

    }

    public static void quicksort(int arr[],int low,int hi){      

 if(low>=hi)  return;

   // all the ele smaller then pivot uske phele 
   // all all the ele greater then pivot uske badd 
         int idx= partition(arr,low,hi);
         quicksort(arr, low, idx-1);
         quicksort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int [] arr={80,30,70,20,60,50,10,90};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
System.out.println();
        System.out.println("after sorting");
            quicksort(arr, 0, arr.length-1);


            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
               
        
    }
}
