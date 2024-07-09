public class mergersort {
    public static void merger2(int [] a,int [] b, int[] c)
    {
               int i=0 ,j=0,k=0;
               while(i<a.length && j<b.length)
               {
                if(a[i]<b[j]) c[k++]=a[i++];
                else    
                c[k++]=b[j++];
               }
               while(i<a.length){
                c[k++]=a[i++];
               }
            while(j<b.length)
            {
                c[k++]=b[j++]; 
            }
    }

    public static void merge(int []arr){
        int n=arr.length;
        if(n==1) return;
        // create 2 array of half half size
        int a[]= new int[n/2];
        int b[]= new int[n-n/2];
        // copy paste main arr element
        for (int i = 0; i < n/2; i++) {
            a[i]=arr[i];
            
        }
        for (int i = 0; i < n-(n/2); i++) {
            b[i]=arr[i+(n/2)];
            
        }
        // magic
        merge(a);
        merge(b);
          // merger a and b
        merger2(a, b, arr);
    }
    


    public static void main(String[] args) {

        int [] arr={80,30,70,20,60,50,10,90};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        merge(arr);
        System.out.println();
        System.out.println("after sorting");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
