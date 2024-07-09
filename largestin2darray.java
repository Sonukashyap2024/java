import java.util.Scanner;

public  class largestin2darray {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][]arr= new int[2][2];
int mx= Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
               // if(mx<arr[i][])mx=
               System.out.print(arr[i][j] +" ");
               
               mx=Math.max(mx,arr[i][j]) ;       
                }
                System.out.println();
            
        }
        System.out.println(mx);
    }
    
}
