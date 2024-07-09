import  java .util.*;
public class spiral {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            // Define ans list to store the result.
           // Define ans list to store the result.
            List<Integer> ans =new ArrayList<>();
        
         int n = matrix.length;
         int m = matrix[0].length;
         
         int top= 0,mincolm=0;
         int maxrow= n-1;
         int maxcolm= m-1;
    
         while(top<=maxrow && mincolm<=maxcolm)
         {
            for(int i=mincolm;i<=maxcolm;i++)
            {
                ans.add(matrix[top][i]);
                top++;
            }
            for(int i= top;i<=maxrow;i++)
            {
                ans.add(matrix[i][maxcolm]);
                maxcolm--;
            }
            if(top<=maxrow)
            {
                for(int i= maxcolm;i>=mincolm;i--)
                {
                    ans.add(matrix[maxrow][i]);
                    maxrow--;
    
                }
            }
            if(mincolm<=maxcolm)
            {
                for(int i=maxrow;i>=top;i--)
                {
                    ans.add(matrix[i][mincolm]);
                    mincolm++;
                }
            }
         }
         return ans;
        }
        
    }
}
