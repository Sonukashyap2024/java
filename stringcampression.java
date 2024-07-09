public class stringcampression {
    public static void main(String[] args) {
        String s= "aaaabbcddeeff";
        char []arr= s.toCharArray();
        String ans= " ";
        int n= arr.length;
        int i=0;
       int j=0;
       while(j<n)
       {
            if(arr[j]== arr[i]) j++;
           
            else
            {
                ans+=arr[i];
                int len=j-i;
                if(len>1)
                {
                    ans= ans+len;
                }
                i=j;
            }

       }
       ans+=arr[i];
       int len=j-i;
       if(len>1)
       {
           ans= ans+len;
       }
       System.out.println(ans);

    }
}
