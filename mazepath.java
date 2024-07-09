import java.util.Scanner;

public class mazepath {
    // using row and colm
    public static int maze(int row,int colm,int m,int n){
           if(row==m  ||colm==n){
            return 1;   
           }

          int rightways=maze(row, colm+1, m, n);
          int downways=maze(row+1, colm, m, n);
          return rightways+downways;
    }
    // using not extra row and colm
    public static int maze2(int m,int n){
        if(m==1  ||n==1){
         return 1;   
        }

       int rightways=maze2( m, n-1);
       int downways=maze2( m-1, n);
       return rightways+downways;
 }
    public static void main(String[] args) {
        System.out.println("enter n and m");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
       System.out.println("total ways");
        System.out.println(maze2(m,n));
    }
}
