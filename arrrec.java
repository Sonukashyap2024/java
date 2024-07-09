public class arrrec {
    public static void printarr(int []arr,int idx)
    {
        if(idx==arr.length)
        {
            return;
        }

        System.out.print(arr[idx]);
        printarr(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[]= {5,3,6,7,8};
    
     // System.out.print(printarr(arr, 0));
     printarr(arr, 0);
        
    }
}
