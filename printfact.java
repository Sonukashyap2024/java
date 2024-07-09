import java.util.Scanner;

public class printfact {
         
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
         
        int fact= n* factorial(n-1);

        return fact;
       
       
    }

    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter positive number");
     int n = sc.nextInt();
   // System.out.println(fact);
        System.out.println("Factorial = " +factorial(n));
    }
    
}
