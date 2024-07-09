public class insertionsort {
    public static void main(String[] args) {
        int []arr={8,4,3,6,10,7};

        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = 1; j < arr.length; j++) 
            {
                if(arr[j-1]>arr[j])
                {
                    int t= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }
            
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    
}
