public class maxarrrec {
public static int maxArr(int arr[],int idx)
{
if(idx==arr.length-1)
{
    return arr[idx];
}

int small= maxArr(arr,idx+1);

return Math.max(arr[idx],small);


}

    public static void main(String[] args) {
int arr[]= {5,9,8,6,34,6};
      
System.out.println(maxArr(arr, 0));
        
    }
}
