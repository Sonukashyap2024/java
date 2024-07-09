public class power {
    public static int Power(int a,int b){
     
        if(b==0)
            return 1;
        int ans=Power(a, b/2);
        if(b%2==0) return  ans*ans;
       else return ans*ans*a;

         
    }
      
    
    public static void main(String args[])
     {
           
        int a=2;
        int b=32;
        System.out.println(Power(a, b)); 

        }

    
}
