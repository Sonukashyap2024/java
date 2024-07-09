public class recuarrsum {
    public static int arrsum(int[]arr,int idx)
    {
        if(idx==arr.length)
        {
            return 0;
        }
      // int ans+=arr[idx];
       int  ans= arrsum(arr, idx+1);
        ans+=arr[idx];
        return ans;
    }

    public static void main(String[] args) {
        int []arr={3,4,5,6,7};
        System.out.println(arrsum(arr, 0));
    }
    
    
}
