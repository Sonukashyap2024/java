public class reversematrix {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6,},{7,8,9}};
        int n=3;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < n/2; j++)
             {
              int  temp= a[i][j];
            a[i][j]=a[i][n-1-j];
            a[i][n-1-j]=temp;
                
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
