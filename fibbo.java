public class fibbo {
    
 public static int fibbonachi(int n)
 {
    if(n==0||n==1)
    {
        return n;
    }
    
    int a= fibbonachi(n-1);
    int b = fibbonachi(n-2);
    return a+b;

 }

    public static void main(String[] args) {
        for(int i=0;i<=6;i++){
        System.out.println(fibbonachi(i));
        }
    }
}
