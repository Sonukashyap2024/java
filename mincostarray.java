public class mincostarray {
    public static int mincost(int[]height,int n,int idx)
    {
      if(idx==n-1) return 0;
      

        int a= Math.abs(height[idx]-height[idx+1])+mincost(height, n, idx+1);
        
        if(idx==n-2) return a;
        int b= Math.abs(height[idx]-height[idx+2])+mincost(height, n, idx+2);
        return  Math.min(a, b);
    }
    public static void main(String[] args) {
        int []height={10,20,30,40,50,60,70};
        int n= height.length;
        System.out.println(mincost(height, n, 0));
     // mincost(height, 0, 0);
    }
}
