public class allsubsetsum {
    public static void sumofsubset(int[]arr,int n, int sum ,int idx)
    {
        if(idx>=n)
        {
            System.out.println(sum);
            return ;
        }

        
        sumofsubset(arr, n, sum+arr[idx], idx+1);
        sumofsubset(arr, n, sum, idx+1);

         return ;

    }
    public static void main(String[] args) {
        int []arr={2,3};
        int n= arr.length;
    sumofsubset(arr, n,0,0);
    }
}
