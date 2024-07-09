import java.util.Scanner;

public class printbracket {
    public static void printparenthesis(int open,int closing,int n,String s)
    {
           if(s.length()==2*n){
           
            System.out.println(s);
            return;
           }

        if(open<n) printparenthesis(open+1, closing, n,s+"(");
        if(closing<open) printparenthesis(open, closing+1,n, s+")");
        
        
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       printparenthesis(0,0,n,"");
    }
}
