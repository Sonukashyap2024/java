

public class frac {
    public static fraction add(fraction f1,fraction f2)
    {
        int numerator= f1.num*f2.deno+ f2.num*f1.deno;
        int denomerator = f1.deno*f2.deno;
     fraction f3= new fraction(numerator, denomerator);

           return f3;
    }
    
    public static int gcd(int num,int deno)
    {
        int min= Math.min(num,deno);
        for(int i=min; i>=1;i--)
        {
            if(num%i==0 && deno%i==0)
            {
                return i;
            }
            //return min;
        }
        return min;


    }
    public static class fraction{
        int num;
        int deno;
         public fraction(int num,int deno)
         {
            this.num= num;
            this.deno=deno;
            
         }
         public void simplify()
         {
            int hcf= gcd(num,deno);
            num= num/hcf;
            deno= deno/hcf;

         }
    }
    public static void main(String[] args) {
        fraction f1= new fraction(1, 2);
        System.out.println(f1.num+"/"+ f1.deno);
        //f1.simplify();
        fraction f2= new fraction(1, 2);
        System.out.println(f2.num+"/"+f2.deno);
        fraction f3 = add(f1,f2);
        f3.simplify();
        System.out.println(f3.num+"/"+f3.deno);

    }
    
}
