import java.util.Scanner;

public class binarystring {
    public static void  printString(String s,int n){
         int m=s.length();
         if(m==n){
            System.out.println(s);
            return;
         }
        
        if(m==0||s.charAt(m-1)=='0'){
            printString(s+0, n);
            printString(s+1, n);

        }
        else   printString(s+0, n);
        return;




    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       printString("",n);

    }

}
