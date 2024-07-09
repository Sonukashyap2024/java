public class kmultilpeofm {

    public static void KtimesM(int m,int k)
    {
        if(k==1)
        {
            System.out.println(m);
            return;
        }
         KtimesM(m, k-1) ;
         System.out.println(m*k);
        return ;
    }
    public static void main(String[] args) 
    {
        int k=10;
       int m=3;
       KtimesM(m, k);
        
    }
    
}
