public class revarray {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        int i=0;
  int j= arr.length-1;
       while(i<j)
       {
         swap(arr,i,j);
    i++;
    j--;
        }
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
    
}
