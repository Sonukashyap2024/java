public class sort0s1s2s {
    
    public static void main(String[] args) {
    
        int []arr={0,1,2,0,1,2,1,2,0,0,2,2};
        int n= arr.length;
        int noOfzeros=0;
        int noOfones=0;
        int noOftwos=0;
        int []ans=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                noOfzeros++;
            }
            else if(arr[i]==1)
            {
                noOfones++;
            }
            else if(arr[i]==2)
            {
                noOftwos++;
            }
        }

        for(int i=0;i<noOfzeros;i++)
        {
            ans[i]=0;
        }
        for(int i=noOfzeros;i<noOfzeros+noOfones;i++)
        {
            ans[i]=1;
        }
        for(int i=noOfzeros+noOfones;i<n;i++)
        {
            ans[i]=2;
        }
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
       
    }
}
