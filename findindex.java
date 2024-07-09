public class findindex {
    public static void findindeces(int []arr,int x,int idx)
    {
        if(idx==arr.length)
        {
            return ;
        }
        if(arr[idx]==x)
        {
            System.out.print(idx+" ");
        }
        findindeces(arr, x, idx+1);
        return;
    }
    public static void main(String[] args) {
        int[]arr={1,2,6,3,4,6,5,6,7};
        int x=6;
        findindeces(arr, x, 0);
    }
}
