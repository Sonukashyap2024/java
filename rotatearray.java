public class rotatearray {
    public static void reverse(int[]arr,int i,int j){
        i=0;
       
        j=arr.length-1;
        while(i<=j)
        {
            int t= arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

       int k=2;
       int n= arr.length;
      // k=k%n;
       reverse(arr,0,n-k-1);
       reverse(arr,n-k,n-1);
       reverse(arr,0,n-1);
       for ( int i = 0; i < arr.length; i++) {
                   System.out.print(arr[i]+" ");

       }

      
    }
  
    
}
