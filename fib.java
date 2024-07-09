public class fib {
    public static int fibbo(int n){
        if(n==0) return n;
        int sum=0;
        sum+=fibbo(n-1);
        System.out.println(sum);
        
        return sum;
    }
    public static void main(String[] args) {
        int n=8;
           fibbo(n);
    }
}
