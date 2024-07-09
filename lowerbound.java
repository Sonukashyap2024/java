public class lowerbound {
    public static void main(String[] args) {
        int []arr= { 23,45,67,88,89,100,169,180};
        int n= arr.length;
        int l=0, h= n-1;
        int lowbound= n;
        while(l<=h)
        {
            int mid= (l+h)/2;
            if(arr[mid]>=88)
            {
                lowbound= Math.min(mid, lowbound);
                h=  mid-1;
            }
            else{
                l= mid+1;
            }
        }
        System.out.println(lowbound);
    }
}
