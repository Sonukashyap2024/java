import java.util.*;
import java.util.Map;

public class maxfreq {
    
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,1,4,5,};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
            mp.put(arr[i],1);
            }
            else
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }

        }
        System.out.println("FREQUENCY IS");
        System.out.println(mp.entrySet());
     
                  int max=0;
                  int anskey=-1;
                   
                  for(var e : mp.entrySet())
                  {
                    if(max<e.getValue())
                    {
                        max= e.getValue();
                        anskey=e.getKey();
                    }
                    
                  }
               



                  System.out.println(anskey);
    
        

        
    }

}
