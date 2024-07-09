public class binaryserach {
    public static void main(String[] args) {
        int []arr= { 23,45,67,89,100,169,180};
        int n= arr.length;
        int l=0, h= n-1;
        
          int target= 200;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==target)
            {
                System.out.print("found"+" "+arr[mid]);
                break;
                
            }
          else  if(arr[mid]<target)
            {
               l = mid+1;
            }
            else if(arr[mid]>target)
            {
                h= mid-1;
            }
           
          
        }
      

    }
    
}
