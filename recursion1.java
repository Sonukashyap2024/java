import java.util.Scanner;

public class recursion1 {
    public static void printincreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
    
        }
        printincreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
       
        printincreasing(n);
    }
    
}
