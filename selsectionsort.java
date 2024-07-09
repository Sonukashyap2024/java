public class selsectionsort {
    public static void main(String[] args) {
        int []arr= {10,4,-20,6,7,55};
        for (int i = 0; i <arr.length-1; i++) {
            int min= Integer.MAX_VALUE;
        int minidx=0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min)
                {
                    min= arr[j];
                    minidx= j;
                }   
            }
       int temp= arr[i];
           arr[i]=arr[minidx];
           arr[minidx]=temp;     
        }
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
    }
}
