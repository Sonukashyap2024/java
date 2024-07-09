public class matrixmultiplication {
    public static void main(String[] args) {
        
        int [][] a= {{1,2,1},{2,1,2}};
     //   int n=a.length;
        int[][]b= {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
      //  int m= b[0].length;
      if(a[0].length!=b.length)
      {
        System.out.println("not possible");
      }

        int [][]c= new int[a.length][b[0].length];
         
           for (int i = 0; i < c.length; i++)
            {
            for (int j = 0; j < c[0].length; j++)
             {
                for (int k = 0; k < b.length; k++) // 2nd walle ki row tk chlega
                {
                    c[i][j]+= (a[i][k]*b[k][j]);
                }    
            } 
           }
           for (int i = 0; i < c.length; i++)
            {
            for (int j = 0; j < c[0].length; j++)
             {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
            
           }

         
    }

    
}
