import java.util.Arrays;

public class arraylist {
    public static class Arraylist{
          int []arr= new int[3];
          int idx=0;
          int size=0;
          public void add(int element)
         {
            if(size==arr.length)
            {
                int []brr= Arrays.copyOf(arr, arr.length*2);
                arr= new int [brr.length];
                arr= Arrays.copyOf(brr, brr.length);
            }
            arr[idx]= element;
            idx++;
            size++;
         }
    }
    public static void main(String[] args) {
        Arraylist  arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        System.out.println(arr.size);
        arr.add(66);
        System.out.println(arr.size);
    }
    
}
