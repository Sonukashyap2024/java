public class rec2 {
    public static int gcd(int x,int y)
    {
        if(y==0)
        {
            return x;
        }
        int ans= gcd(y,x%y);
        return ans; 
    }
    public static void main(String[] args) {
      System.out.println(gcd(100,15));  
    }
    
}
