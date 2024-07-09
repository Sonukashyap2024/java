public class findpower {
       
    public static int power(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }
        int ans= power(p,q-1)*p;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    
}
