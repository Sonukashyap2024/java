public class bubblesort {
    public static void main(String[] args) {
        int[]arr= {4,3,6,1,8,10};

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1])
                {
                    int t= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }

}
